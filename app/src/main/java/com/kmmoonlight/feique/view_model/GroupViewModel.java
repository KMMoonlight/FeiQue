package com.kmmoonlight.feique.view_model;

import com.kmmoonlight.entity.GroupRepo;
import com.kmmoonlight.network.RetrofitClient;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class GroupViewModel extends ViewModel {

    private MutableLiveData<GroupRepo> groupRepoLiveData;

    public LiveData<GroupRepo> getViewModel() {
        if (groupRepoLiveData == null) {
            groupRepoLiveData = new MutableLiveData<>();
        }

        return groupRepoLiveData;
    }

    public void loaderData(int id) {

        RetrofitClient.getRequestClient()
                .getGroupData(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Response<GroupRepo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response<GroupRepo> groupRepoResponse) {
                        groupRepoLiveData.postValue(groupRepoResponse.body());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
