package dev.saintho.pawwow.domain.repository;

import java.util.Optional;

import dev.saintho.pawwow.domain.entity.command.PetVote;
import dev.saintho.pawwow.domain.entity.vo.Voter;

public interface PetVoteRepository {
	Optional<PetVote> findByCandidateIdAndVoter(Long candidateId, Voter voter);

	PetVote save(PetVote petVote);

	void delete(PetVote petVote);
}
