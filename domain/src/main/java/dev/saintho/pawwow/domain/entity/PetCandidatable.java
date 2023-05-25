package dev.saintho.pawwow.domain.entity;

public interface PetCandidatable {
	Long getId();
	String getName();
	String getProfileImage();
	String getBriefDescription();
	String getDescription();
	PetType getType();
}
