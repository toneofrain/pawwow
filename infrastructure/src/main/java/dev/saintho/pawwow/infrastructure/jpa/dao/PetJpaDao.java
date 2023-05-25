package dev.saintho.pawwow.infrastructure.jpa.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import dev.saintho.pawwow.infrastructure.jpa.entity.Pet;

public interface PetJpaDao extends CrudRepository<Pet, Long> {
	Optional<Pet> findById(Long id);
}
