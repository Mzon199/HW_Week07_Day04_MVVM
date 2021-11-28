package com.twq.w7_day4_mvvm.repository

import androidx.lifecycle.MutableLiveData
import com.twq.w7_day4_mvvm.model.User
import com.twq.w7_day4_mvvm.model.user
import com.twq.w7_day4_mvvm.network.Api
import com.twq.w7_day4_mvvm.network.UserService
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class userRepostiroy {
    fun login(username:String,passwoerd:String):liveData<User>{
        var mLiveData=MutableLiveData<User>
        var userService=Api.getInstance().create(UserService::class.java)
            .enqueu(object :Callback<list<User>> {
                override fun onResonse(cll: Call<list<User>>, response: Response<list<User>>) {
                    var listoFusers = response

            }
    }

    }


class liveData<T> {

}
