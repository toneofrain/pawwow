package dev.saintho.pawwow.domain.entity;

public class PetVote {
	private Long id;
	private PetCandidate candidate;
	private Voter voter;

	public static PetVote from(PetVotable petVotable) {
		return new PetVote(
			petVotable.getId(),
			petVotable.getCandidate(),
			petVotable.getVoter());
	}

	private PetVote(Long id, PetCandidate candidate, Voter voter) {
		this.id = id;
		this.candidate = candidate;
		this.voter = voter;
	}
}
