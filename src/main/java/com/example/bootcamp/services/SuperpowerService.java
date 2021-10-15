package com.example.bootcamp.services;

//SUPERPOWER SERVICE

import com.example.bootcamp.models.Superpower;
import com.example.bootcamp.repository.SuperpowerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuperpowerService {
    private final SuperpowerRepository superpowerRepo;

    public SuperpowerService(SuperpowerRepository superpowerRepo) {
        this.superpowerRepo = superpowerRepo;
    }


    public List<Superpower> findAll() {
        return superpowerRepo.findAll();
    }

    public Superpower findById(Long id) {
        Optional<Superpower> superpower = superpowerRepo.findById(id);
        if (superpower.isPresent()) superpower.get();
        return null;
    }

    public Superpower save(Superpower superpower) {
        return superpowerRepo.save(superpower);
    }
}