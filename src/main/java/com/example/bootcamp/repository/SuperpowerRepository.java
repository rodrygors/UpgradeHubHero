package com.example.bootcamp.repository;

//SUPERPOWER REPOSITORY
import com.example.bootcamp.models.Superpower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperpowerRepository extends JpaRepository<Superpower, Long> {
}
