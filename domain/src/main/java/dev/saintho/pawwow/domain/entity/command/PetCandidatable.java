package dev.saintho.pawwow.domain.entity.command;

import dev.saintho.pawwow.domain.entity.vo.PetType;

public interface PetCandidatable {
	Long getId();
	String getName();
	String getProfileImage();
	String getBriefDescription();
	String getDescription();
	PetType getType();
}
