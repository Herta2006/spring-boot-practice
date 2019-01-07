package io.vklindukhov.springbootpractice.controller;

import io.vklindukhov.springbootpractice.domain.Club;
import io.vklindukhov.springbootpractice.service.ClubService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ClubController {
    private final ClubService clubService;

    @Autowired
    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @GetMapping("/clubs")
    public Iterable<Club> all() {
        log.info("Getting all matches");
        return clubService.all();
    }
}
