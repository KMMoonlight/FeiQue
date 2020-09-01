package com.kmmoonlight.feique.view_model;

import com.kmmoonlight.entity.BannerRepo;
import com.kmmoonlight.network.RetrofitClient;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class BannerViewModel extends ViewModel {

    private MutableLiveData<BannerRepo> bannerRepoData;

    public LiveData<BannerRepo> getData() {

        if (bannerRepoData == null) {
            bannerRepoData = new MutableLiveData<BannerRepo>();
            loadData();
        }

        return bannerRepoData;
    }

    private void loadData() {
        RetrofitClient.getRequestClient()
                .getBannerData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Response<BannerRepo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response<BannerRepo> bannerRepoResponse) {
                        bannerRepoData.postValue(bannerRepoResponse.body());
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
