package io.vklindukhov.springbootpractice.service;

import io.vklindukhov.springbootpractice.domain.Match;
import io.vklindukhov.springbootpractice.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchServiceImpl implements MatchService {
    private final MatchRepository matchRepository;

    @Autowired
    public MatchServiceImpl(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override
    public Iterable<Match> all() {
        return matchRepository.findAll();
    }
}
