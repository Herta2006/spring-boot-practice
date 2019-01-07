package io.vklindukhov.springbootpractice.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;


@Data
@ToString(of = { "fullName" })
@Entity
public class Club {
    @Id
    @GeneratedValue
    private Integer id;
    private String url;
    private String fullName;
    @OneToMany(cascade = ALL, fetch = LAZY, targetEntity = Player.class)
    private Set<Player> players;
}
