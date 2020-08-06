package com.dux.chess.web.controller.v1

import com.dux.chess.usecase.UseCaseCreateMatch
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/match/v1")
class MatchController() {

    private lateinit var useCaseCreateMatch: UseCaseCreateMatch

    @Autowired
    constructor(useCaseCreateMatch: UseCaseCreateMatch): this() {
        this.useCaseCreateMatch = useCaseCreateMatch
    }

    @GetMapping("/create")
    fun createMatch(@RequestParam("opponent") opponent: String?): String {
        return useCaseCreateMatch.execute(opponent)
    }
}