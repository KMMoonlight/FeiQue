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

public class BookViewModel extends ViewModel {

    private MutableLiveData<BookRepo> bookRepoLiveData;

    public LiveData<BookRepo> getViewModel() {

        if (bookRepoLiveData == null) {

            bookRepoLiveData = new MutableLiveData<BookRepo>();

            dataLoader();
        }

        return bookRepoLiveData;
    }

    private void dataLoader() {
        RetrofitClient.getRequestClient().getBookData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Response<BookRepo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response<BookRepo> bookRepoResponse) {
                        bookRepoLiveData.postValue(bookRepoResponse.body());
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
