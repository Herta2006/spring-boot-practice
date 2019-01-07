package io.vklindukhov.springbootpractice.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Match {
    @Id
    @GeneratedValue
    private Integer id;
    private String url;
    private LocalDateTime kickOff;
}
