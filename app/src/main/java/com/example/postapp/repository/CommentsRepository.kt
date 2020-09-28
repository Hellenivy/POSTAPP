package com.example.postapp.repository
import com.example.postapp.api.ApiInterface
import com.facebook.stetho.inspector.protocol.module.Network
import ke.co.postmvvm.models.Comment
import org.w3c.dom.Comment

class CommentsRepository {
    suspend fun  getComments(postsId:Int): Network.Response<list<Comment>=withContext(Dispachers.10)
    var apiInterface = ApiClient.buildService(ApiInterface)
}