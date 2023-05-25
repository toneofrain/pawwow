package dev.saintho.pawwow.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.saintho.pawwow.domain.outbox.PetOutboxEvent;
import dev.saintho.pawwow.domain.repository.PetOutboxRepository;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class PetOutboxService {
	private final PetOutboxRepository petOutboxRepository;

	@EventListener(PetOutboxEvent.class)
	public void handle(PetOutboxEvent event) {
		petOutboxRepository.save(event);
	}
}
