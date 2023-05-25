package dev.saintho.pawwow.domain.entity;

public interface PetVotable {
	Long getId();
	Long getCandidateId();
	Voter getVoter();
}
