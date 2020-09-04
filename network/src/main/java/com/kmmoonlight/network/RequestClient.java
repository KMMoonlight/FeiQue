package com.kmmoonlight.network;

import com.kmmoonlight.entity.BannerRepo;
import com.kmmoonlight.entity.BookRepo;
import com.kmmoonlight.entity.DocTreeRepo;
import com.kmmoonlight.entity.FindDocRepo;
import com.kmmoonlight.entity.GroupRepo;
import com.kmmoonlight.entity.HotRepo;
import com.kmmoonlight.entity.RecommendRepo;
import com.kmmoonlight.entity.UserRepo;
import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RequestClient {

    @GET(ApiSet.bannerUrl)
    Observable<Response<BannerRepo>> getBannerData();

    @GET(ApiSet.hotUrl)
    Observable<Response<HotRepo>> getHotData();

    @GET(ApiSet.recommendUrl)
    Observable<Response<RecommendRepo>> getRecommendData();

    @GET(ApiSet.findDocUrl)
    Observable<Response<FindDocRepo>> getFindDocData(@Path("book_id") int bookId, @Path("id") int id);

    @GET(ApiSet.userUrl)
    Observable<Response<UserRepo>> getUserData();

    @GET(ApiSet.groupUrl)
    Observable<Response<GroupRepo>> getGroupData(@Path("id") int id);

    @GET(ApiSet.repoGroupUrl)
    Observable<Response<BookRepo>> getGroupRepoData(@Path("id") int id);

    @GET(ApiSet.repoUserUrl)
    Observable<Response<BookRepo>> getUserRepoData(@Path("id") int id);

    @GET(ApiSet.docTreeUrl)
    Observable<Response<DocTreeRepo>> getDocTreeData(@Path("id") int id);
}
