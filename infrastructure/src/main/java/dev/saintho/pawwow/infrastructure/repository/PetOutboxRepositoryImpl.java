package dev.saintho.pawwow.infrastructure.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dev.saintho.pawwow.domain.outbox.PetOutboxEvent;
import dev.saintho.pawwow.domain.repository.PetOutboxRepository;
import dev.saintho.pawwow.infrastructure.jpa.dao.PetOutboxJpaDao;
import dev.saintho.pawwow.infrastructure.jpa.entity.PetOutbox;
import lombok.RequiredArgsConstructor;

@Repository
@Transactional
@RequiredArgsConstructor
public class PetOutboxRepositoryImpl implements PetOutboxRepository {
	private final PetOutboxJpaDao petOutboxJpaDao;

	@Override
	public void save(PetOutboxEvent event) {

		petOutboxJpaDao.save(
			PetOutbox.from(event));
	}
}
