package com.example.room

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.room.data.UserDatabase
import com.example.room.data.UserRepository
import com.example.room.data.Usuario
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(context : Context) : ViewModel() {

    val selectUsers: LiveData<List<Usuario>>
    val repository : UserRepository

    init{
        val userDao = UserDatabase.getDatabase(context).userDao()
        repository = UserRepository(userDao)
        selectUsers = repository.selectUsers
    }

    fun addUsers(usuario: Usuario){
        viewModelScope.launch(Dispatchers.IO){
            repository.addUser(usuario)
        }
    }

}