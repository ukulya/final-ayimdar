package kg.itc.examplemvvm.data.network

import kg.itc.examplemvvm.data.models.Quote
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiService {

    @GET("random")
    suspend fun getRandomQuote(): Response<Quote>

}