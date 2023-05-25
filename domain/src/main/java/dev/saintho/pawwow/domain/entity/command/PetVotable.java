package dev.saintho.pawwow.domain.entity.command;

import dev.saintho.pawwow.domain.entity.vo.Voter;

public interface PetVotable {
	Long getId();
	Long getCandidateId();
	Voter getVoter();
}
