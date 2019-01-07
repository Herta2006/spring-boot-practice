package io.vklindukhov.springbootpractice.repository;

import io.vklindukhov.springbootpractice.domain.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Integer> {
}
