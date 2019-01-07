package io.vklindukhov.springbootpractice.service;

import io.vklindukhov.springbootpractice.domain.Match;

public interface MatchService {
    Iterable<Match> all();
}
