package dev.saintho.pawwow.domain.repository;

import dev.saintho.pawwow.domain.entity.PetCandidate;

public interface PetCandidateRepository {
	PetCandidate findVerifiedOneById(Long id);

	PetCandidate save(PetCandidate petCandidate);
}
