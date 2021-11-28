package com.twq.w7_day4_mvvm.view.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.twq.w7_day4_mvvm.R
import com.twq.w7_day4_mvvm.model.User
import com.twq.w7_day4_mvvm.repository.HomeRepository

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val viewModel:HomeViewModel by viewModels()

        var mRecyclerView=findViewById<RecyclerView>(R.id.RecyclerView)
        mRecyclerView.layoutManager= LinearLayoutManager(this)

        viewModel.getUser().observe(this,{list ->
            mRecyclerView.adapter=HomeAdapter(list)
        })

    }
}

class HomeViewModel: ViewModel(){


    var homeRepositry= HomeRepository()
    fun getUser(): LiveData<List<User>> {
        return homeRepositry.getAllUser()
    }
}






