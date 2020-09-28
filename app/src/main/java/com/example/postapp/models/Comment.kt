package com.example.postapp.models

import com.example.postapp.viewmodel.PostsViewModel
import com.example.postapp.viewmodel.PostsViewModelFactory

class CommentActivity : AppCompactActivity() {
    var postId:=0
    lateinit var postaViewModel:PostsViewModel
    lateinit var postsViewModelFactory:PostsViewModelFactory

    overide fun onCreate(SvedInstanceState:)

}