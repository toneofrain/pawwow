package dev.saintho.pawwow.domain.repository;

import dev.saintho.pawwow.domain.outbox.PetOutboxEvent;

public interface PetOutboxRepository {
	void save(PetOutboxEvent event);
}
