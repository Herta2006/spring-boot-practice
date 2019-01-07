package io.vklindukhov.springbootpractice.controller;

import io.vklindukhov.springbootpractice.domain.Player;
import io.vklindukhov.springbootpractice.service.PlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public Iterable<Player> all() {
        log.info("Getting all players");
        return playerService.all();
    }

    @PostMapping("/players")
    public void one(@RequestBody Iterable<Player> players) {
        log.info("Adding new players {}", players);
        playerService.add(players);
    }

    @GetMapping("/players/{id}")
    public Player one(@PathVariable Integer id) {
        log.info("Getting player by id {}", id);
        return playerService.find(id);
    }

    @PutMapping("/players/{id}")
    public void update(@PathVariable Integer id, @RequestBody Player player) {
        log.info("Updating player {} by id {}", player, id);
        playerService.update(id, player);
    }

    @DeleteMapping("/players/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("Deleting player by id {}", id);
        playerService.delete(id);
    }
}
