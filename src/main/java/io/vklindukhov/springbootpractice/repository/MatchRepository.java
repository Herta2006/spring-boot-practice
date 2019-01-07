package io.vklindukhov.springbootpractice.repository;

import io.vklindukhov.springbootpractice.domain.Match;
import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends CrudRepository<Match, Integer> {
}
