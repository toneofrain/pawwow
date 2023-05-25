package dev.saintho.pawwow.domain.repository;

import java.util.Optional;

import dev.saintho.pawwow.domain.entity.PetVote;
import dev.saintho.pawwow.domain.entity.Voter;

public interface PetVoteRepository {
	Optional<PetVote> findByPetIdAndVoter(Long petId, Voter voter);

	void delete(PetVote petVote);
}
