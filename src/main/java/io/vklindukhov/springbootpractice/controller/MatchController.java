package io.vklindukhov.springbootpractice.controller;

import io.vklindukhov.springbootpractice.domain.Match;
import io.vklindukhov.springbootpractice.service.MatchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MatchController {
    private final MatchService matchService;

    @Autowired
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/matches")
    public Iterable<Match> all() {
        log.info("Getting all matches");
        return matchService.all();
    }
}
