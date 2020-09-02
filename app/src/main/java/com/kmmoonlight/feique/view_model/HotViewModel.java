package com.kmmoonlight.feique.view_model;

import com.kmmoonlight.entity.HotRepo;
import com.kmmoonlight.network.RetrofitClient;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class HotViewModel extends ViewModel {

    private MutableLiveData<HotRepo> hotRepoLiveData;

    public LiveData<HotRepo> getViewModel() {

        if (hotRepoLiveData == null) {
            hotRepoLiveData = new MutableLiveData<>();
            dataLoader();
        }
        return hotRepoLiveData;
    }

    private void dataLoader() {
        RetrofitClient.getRequestClient()
                .getHotData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Response<HotRepo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response<HotRepo> hotRepoResponse) {
                        hotRepoLiveData.postValue(hotRepoResponse.body());
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
