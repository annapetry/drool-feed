package annapetry.com.droolfeed.networking

//import annapetry.com.networking.responses.annapetry.com.droolfeed.networking.responses.BAFeedResponse
import annapetry.com.droolfeed.networking.responses.Cookbooks101.Cookbooks101FeedResponse
import retrofit2.http.GET
import retrofit2.http.Url
import io.reactivex.Observable
import retrofit2.Response


/**
 *  Created by Anna Petry on 3/25/18.
 *  Copyright (c) 2018 Mango Health. All rights reserved.
 */
interface ApiService {
//    @GET
//    fun getBAHealthyishFeed(@Url url: String): Observable<Response<annapetry.com.droolfeed.networking.responses.BAFeedResponse>>

    @GET
    fun get101CookbooksFeed(@Url url: String): Observable<Response<Cookbooks101FeedResponse>>
}