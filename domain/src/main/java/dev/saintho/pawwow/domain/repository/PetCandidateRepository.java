package dev.saintho.pawwow.domain.repository;

import dev.saintho.pawwow.domain.entity.command.PetCandidate;

public interface PetCandidateRepository {
	PetCandidate findVerifiedOneById(Long id);

	PetCandidate save(PetCandidate petCandidate);
}
