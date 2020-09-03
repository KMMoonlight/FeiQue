package com.kmmoonlight.feique.view_model;

import com.kmmoonlight.entity.BookRepo;
import com.kmmoonlight.network.RetrofitClient;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class GroupRepoViewModel extends ViewModel {

    private MutableLiveData<BookRepo> repoLiveData;

    public void loadData(int id) {

        RetrofitClient.getRequestClient()
                .getGroupRepoData(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Response<BookRepo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response<BookRepo> bookRepoResponse) {
                        repoLiveData.postValue(bookRepoResponse.body());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public LiveData<BookRepo> getViewModel() {
        if (repoLiveData == null) {
            repoLiveData = new MutableLiveData<>();
        }

        return repoLiveData;
    }
}
