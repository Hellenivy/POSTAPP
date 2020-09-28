package com.example.postapp.viewmodels

import com.example.postapp.repository.PostsRepository
import com.example.postapp.viewmodel.PostsViewModel
import java.lang.IllegalArgumentException

class CommentsViewModelFactory(val commentRepository:PostRepository): ViewModel.Factory{
    override fun <T : ViewModel?> create(modelClass:Class<T>){
        if(modelClass.isAssignableFrom(PostsViewModel::class.java)){
        return PostsViewModel(PostsRepository)
    }
        throw IllegalArgumentException("Unknown Viewmodel class")

}