package io.vklindukhov.springbootpractice.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@ToString(of = { "fullName" })
@Entity
public class Player {
    @Id
    @GeneratedValue
    private Integer id;
    private String url;
    private String fullName;
    private Short age;
    private Short height;
    private Short weight;
    private Integer tmPrice;
}
