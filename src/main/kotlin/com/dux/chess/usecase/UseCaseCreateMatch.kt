package com.dux.chess.usecase

import org.springframework.stereotype.Component

@Component
class UseCaseCreateMatch {

    fun execute(opponent: String?): String {
        return "Ok"
    }


}
