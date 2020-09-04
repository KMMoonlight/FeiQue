package com.kmmoonlight.feique.view_model;

import com.kmmoonlight.entity.DocTreeRepo;
import com.kmmoonlight.network.RetrofitClient;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class DocTreeViewModel extends ViewModel {

    private MutableLiveData<DocTreeRepo> docTreeRepoLiveData;


    public void loadData(int id) {

        RetrofitClient.getRequestClient()
                .getDocTreeData(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Response<DocTreeRepo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response<DocTreeRepo> docTreeRepoResponse) {
                        docTreeRepoLiveData.postValue(docTreeRepoResponse.body());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


    public MutableLiveData<DocTreeRepo> getViewModel() {
        if (docTreeRepoLiveData == null){
            docTreeRepoLiveData = new MutableLiveData<>();
        }
        return docTreeRepoLiveData;
    }
}
