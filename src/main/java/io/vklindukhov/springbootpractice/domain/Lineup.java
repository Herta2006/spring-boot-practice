package io.vklindukhov.springbootpractice.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Lineup {
    @Id
    @GeneratedValue
    private Integer id;
//    @OneToMany(cascade = ALL, fetch = LAZY, targetEntity = Player.class)
//    private Set<Player> lineup;
//    @OneToMany(cascade = ALL, fetch = LAZY, targetEntity = Player.class)
//    private Set<Player> bench;

}
