package dev.saintho.pawwow.domain.entity;

public interface PetVotable {
	Long getId();
	PetCandidate getCandidate();
	Voter getVoter();
}
