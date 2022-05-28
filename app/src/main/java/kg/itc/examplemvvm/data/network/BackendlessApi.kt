package kg.itc.examplemvvm.data.network
//
//import com.kay.progayim.data.models.User
//import io.reactivex.Observable
//import retrofit2.http.*
//import java.util.*
//
//interface BackendlessApi {
//
//    @GET("api/data/Ayim")
//    fun getUsers(): Observable<List<User>>
//
//    @POST("api/data/Ayim")
//    fun saveUser(
//        @Body user: User
//    ): Observable<Unit>
//
//
//    @PUT("api/data/Ayim/{objectId}")
//    fun updateUser(
//        @Path("objectId") objectId: String,
//        @Body user: User
//    ): Observable<Unit>
//}