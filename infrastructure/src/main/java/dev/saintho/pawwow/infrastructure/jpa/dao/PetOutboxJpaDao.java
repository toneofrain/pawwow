package dev.saintho.pawwow.infrastructure.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import dev.saintho.pawwow.infrastructure.jpa.entity.PetOutbox;

public interface PetOutboxJpaDao extends CrudRepository<PetOutbox, Long> {
}
