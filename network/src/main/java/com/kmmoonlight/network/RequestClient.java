package com.kmmoonlight.network;

import com.kmmoonlight.entity.BannerRepo;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;

public interface RequestClient {

    @GET(ApiSet.bannerUrl)
    Observable<Response<BannerRepo>> getBannerData();





}
