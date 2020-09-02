package com.kmmoonlight.network;

public class ApiSet {


    //Banner
    public static final String bannerUrl = RetrofitClient.BASE_URL + "explore/selections?limit=4";

    //Book
    public static final String bookUrl = RetrofitClient.BASE_URL + "explore/books?limit=20";

    //Hot
    public static final String hotUrl = RetrofitClient.BASE_URL + "explore/docs?limit=20";

    //Recommend
    public static final String recommendUrl = RetrofitClient.BASE_URL + "explore/recommends?limit=20";


    public static final String findDocUrl = RetrofitClient.BASE_URL + "docs/{slug}";
}
