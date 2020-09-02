package com.kmmoonlight.feique.view_model;

import com.kmmoonlight.entity.FindDocRepo;
import com.kmmoonlight.network.RetrofitClient;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class FindDocViewModel extends ViewModel {

    private MutableLiveData<FindDocRepo> findDocRepoLiveData;

    public LiveData<FindDocRepo> getViewModel() {

        if (findDocRepoLiveData == null) {
            findDocRepoLiveData = new MutableLiveData<>();
        }

        return findDocRepoLiveData;
    }

    public void loaderData(String slug, int book_id) {
        RetrofitClient.getRequestClient()
                .getFindDocData(slug, book_id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Response<FindDocRepo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response<FindDocRepo> findDocRepoResponse) {
                        findDocRepoLiveData.postValue(findDocRepoResponse.body());
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
