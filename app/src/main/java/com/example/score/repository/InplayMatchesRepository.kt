package com.example.score.repository

import com.example.score.data.remote.ElenaApiService
import com.example.score.data.remote.model.Match
import javax.inject.Inject

class InplayMatchesRepository @Inject constructor(private val elenaApiService: ElenaApiService){

    suspend  fun getAllInPlayMatches(): List<Match> = elenaApiService.getInplayMatches().data
}