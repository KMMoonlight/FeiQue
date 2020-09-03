package com.kmmoonlight.network;

public class ApiSet {

    //Banner
    public static final String bannerUrl = RetrofitClient.BASE_URL + "explore/selections?limit=4";

    //Hot
    public static final String hotUrl = RetrofitClient.BASE_URL + "explore/docs?limit=20";

    //Recommend
    public static final String recommendUrl = RetrofitClient.BASE_URL + "explore/recommends?limit=20";

    //Doc
    public static final String findDocUrl = RetrofitClient.BASE_URL + "v2/repos/{book_id}/docs/{id}";

    //User
    public static final String userUrl = RetrofitClient.BASE_URL + "v2/user";

    //Group
    public static final String groupUrl = RetrofitClient.BASE_URL + "v2/users/{id}/groups";

    //Repo
    public static final String repoGroupUrl = RetrofitClient.BASE_URL + "v2/groups/{id}/repos?type=Book";

    //Repo
    public static final String repoUserUrl = RetrofitClient.BASE_URL + "v2/users/{id}/repos?type=Book";


}
