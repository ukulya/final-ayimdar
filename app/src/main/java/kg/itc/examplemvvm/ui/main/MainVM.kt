package kg.itc.examplemvvm.ui.main

//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import dagger.hilt.android.lifecycle.HiltViewModel
//import kg.itc.examplemvvm.domain.models.User
//import kg.itc.examplemvvm.domain.use_cases.GetUserUseCase
//import kg.itc.examplemvvm.ui.base.BaseEvent
//import kg.itc.examplemvvm.ui.base.BaseVM
//import javax.inject.Inject
//
//@HiltViewModel
//class MainVM @Inject constructor(
//    private val getUserUseCase: GetUserUseCase
//): BaseVM() {
//
//    private val _user =  MutableLiveData<List<User>>()
//    val user: LiveData<List<User>>
//    get() = _user
//
//    fun getUser(){
//        disposable.add(
//            getUserUseCase()
//                .subscribe({
//                     _user.value = it
//                },{
//                    _event.value = BaseEvent.ShowToast(it.message ?: "")
//                })
//        )
//    }
//}