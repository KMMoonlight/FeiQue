package com.kmmoonlight.feique.view_model;

import com.kmmoonlight.entity.RecommendRepo;
import com.kmmoonlight.network.RetrofitClient;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class RecommendViewModel extends ViewModel {

    private MutableLiveData<RecommendRepo> recommendLiveData;

    public LiveData<RecommendRepo> getViewModel() {

        if (recommendLiveData == null) {
            recommendLiveData = new MutableLiveData<RecommendRepo>();
            loaderData();
        }

        return recommendLiveData;
    }

    private void loaderData() {
        RetrofitClient.getRequestClient()
                .getRecommendData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Response<RecommendRepo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response<RecommendRepo> recommendRepoResponse) {
                        recommendLiveData.postValue(recommendRepoResponse.body());
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
