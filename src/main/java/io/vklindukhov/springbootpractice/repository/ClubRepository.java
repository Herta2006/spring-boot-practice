package io.vklindukhov.springbootpractice.repository;

import io.vklindukhov.springbootpractice.domain.Club;
import org.springframework.data.repository.CrudRepository;

public interface ClubRepository extends CrudRepository<Club, Integer> {
}
