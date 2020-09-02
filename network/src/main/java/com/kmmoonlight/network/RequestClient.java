package com.kmmoonlight.network;

import com.kmmoonlight.entity.BannerRepo;
import com.kmmoonlight.entity.BookRepo;
import com.kmmoonlight.entity.FindDocRepo;
import com.kmmoonlight.entity.HotRepo;
import com.kmmoonlight.entity.RecommendRepo;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RequestClient {

    @GET(ApiSet.bannerUrl)
    Observable<Response<BannerRepo>> getBannerData();

    @GET(ApiSet.bookUrl)
    Observable<Response<BookRepo>> getBookData();

    @GET(ApiSet.hotUrl)
    Observable<Response<HotRepo>> getHotData();

    @GET(ApiSet.recommendUrl)
    Observable<Response<RecommendRepo>> getRecommendData();

    @GET(ApiSet.findDocUrl)
    Observable<Response<FindDocRepo>> getFindDocData(@Path("slug") String slug, @Query("book_id") int bookId);

}
