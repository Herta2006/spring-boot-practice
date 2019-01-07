package io.vklindukhov.springbootpractice.service;

import io.vklindukhov.springbootpractice.domain.Player;
import io.vklindukhov.springbootpractice.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public Iterable<Player> all() {
        return playerRepository.findAll();
    }

    @Override
    public Player find(Integer id) {
        return playerRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public void add(Iterable<Player> players) {
        playerRepository.saveAll(players);
    }

    @Override
    public void update(Integer id, Player player) {
        playerRepository.save(player);
    }

    @Override
    public void delete(Integer id) {
        playerRepository.deleteById(id);
    }
}
