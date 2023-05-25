package dev.saintho.pawwow.domain.outbox;

import dev.saintho.pawwow.domain.entity.command.PetVote;

public enum OutboxEventType {
	PET_VOTE_CREATE(PetVote.class);

	private final Class<?> subjectType;

	public Class<?> getSubjectType() {
		return subjectType;
	}

	OutboxEventType(Class<?> subjectType) {
		this.subjectType = subjectType;
	}
}
