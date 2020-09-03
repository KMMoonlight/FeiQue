package com.kmmoonlight.feique.view_model;

import com.kmmoonlight.entity.UserRepo;
import com.kmmoonlight.network.RetrofitClient;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class UserViewModel extends ViewModel {

    private MutableLiveData<UserRepo> userRepoLiveData;

    public LiveData<UserRepo> getViewModel() {

        if (userRepoLiveData == null) {
            userRepoLiveData = new MutableLiveData<>();
            loaderData();
        }

        return userRepoLiveData;
    }

    private void loaderData() {

        RetrofitClient.getRequestClient()
                .getUserData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Response<UserRepo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response<UserRepo> userRepoResponse) {
                        userRepoLiveData.postValue(userRepoResponse.body());
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
