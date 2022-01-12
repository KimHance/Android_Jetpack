package com.example.ktor_client_tutorial


import io.ktor.client.request.*

object UserRepo {

    suspend fun fetchUser(): List<User> {

        var url = "https://615075ada706cd00179b745c.mockapi.io/users"

        return KtorClient.httpClient.get(url)

//        return KtorClient.httpClient.use{
//            it.get(url)
//        }
    }
}