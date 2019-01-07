package io.vklindukhov.springbootpractice.service;

import io.vklindukhov.springbootpractice.domain.Player;

import java.util.Collection;

public interface PlayerService {
    Iterable<Player> all();

    Player find(Integer id);

    void add(Iterable<Player> players);

    void update(Integer id, Player player);

    void delete(Integer id);
}
