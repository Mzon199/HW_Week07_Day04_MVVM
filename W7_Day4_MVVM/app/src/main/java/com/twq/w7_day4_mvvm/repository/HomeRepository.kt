package com.twq.w7_day4_mvvm.repository

import android.bluetooth.BluetoothHidDevice
import android.telecom.Call
import androidx.lifecycle.MutableLiveData
import com.twq.w7_day4_mvvm.model.User
import com.twq.w7_day4_mvvm.network.Api
import retrofit2.Response

class HomeRepository  {

    fun getAllUser() : MutableLiveData<List<User>> {

        var userList =MutableLiveData<List<User>>()
        val homeService= Api.getInstance().create(HomeService::class.java)
        val callUserList =homeService.getAllUsers()
        callUserList.enqueue(object : BluetoothHidDevice.Callback<List<User>> {
            fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                userList.postValue(response.body())            }

            fun onFailure(call: Call<List<User>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
        return userList






    }

}
}