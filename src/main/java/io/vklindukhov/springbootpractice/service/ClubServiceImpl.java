package io.vklindukhov.springbootpractice.service;

import io.vklindukhov.springbootpractice.domain.Club;
import io.vklindukhov.springbootpractice.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubServiceImpl implements ClubService {
    private final ClubRepository clubRepository;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public Iterable<Club> all() {
        return clubRepository.findAll();
    }
}
