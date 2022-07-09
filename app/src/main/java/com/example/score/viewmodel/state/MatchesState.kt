package com.example.score.viewmodel.state

import com.example.score.data.remote.model.Match

sealed class MatchesState {
    object Empty : MatchesState()
    object Loading : MatchesState()
    class Success(val data: List<Match>): MatchesState()
    class Error(val message: String): MatchesState()
}
