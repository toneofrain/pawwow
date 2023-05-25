package dev.saintho.pawwow.domain.entity.command;

import dev.saintho.pawwow.domain.entity.vo.Voter;

public class PetVote {
	private Long id;
	private Long candidateId;
	private Voter voter;

	public static PetVote from(PetVotable petVotable) {
		return new PetVote(
			petVotable.getId(),
			petVotable.getCandidateId(),
			petVotable.getVoter());
	}

	public Long getId() {
		return id;
	}

	public Long getCandidateId() {
		return candidateId;
	}

	public Voter getVoter() {
		return voter;
	}

	private PetVote(Long id, Long candidateId, Voter voter) {
		this.id = id;
		this.candidateId = candidateId;
		this.voter = voter;
	}
}
