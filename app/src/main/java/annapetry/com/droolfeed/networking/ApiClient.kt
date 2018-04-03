package annapetry.com.droolfeed.networking

import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import org.simpleframework.xml.convert.AnnotationStrategy
import org.simpleframework.xml.core.Persister
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory


/**
 *  Created by Anna Petry on 3/25/18.
 *  Copyright (c) 2018 Mango Health. All rights reserved.
 */

object ApiClient {
    private var _service: ApiService? = null
    val service: ApiService
        get() {
            if (_service == null) {
                val retrofit = Retrofit.Builder()
                        .baseUrl("https://www.annapetry.com")
                        .addConverterFactory(SimpleXmlConverterFactory.createNonStrict(Persister(AnnotationStrategy())))
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                        .client(OkHttpClient())
                        .build()

                _service = retrofit.create(ApiService::class.java)
            }
            return _service ?: throw AssertionError("Set to null by another thread")
        }
}