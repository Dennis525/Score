package com.example.score.data.remote

import com.example.score.data.remote.model.InplayMatchesResponse
import com.example.score.util.GET_INPLAY_FIXTURES
import retrofit2.http.GET

interface ElenaApiService {
 @GET(GET_INPLAY_FIXTURES)
 suspend fun getInplayMatches(): InplayMatchesResponse
}