package dev.saintho.pawwow.domain.entity.query;

import java.util.Set;

import dev.saintho.pawwow.domain.entity.vo.PetType;
import dev.saintho.pawwow.domain.entity.vo.Voter;

public interface PetDetailable {
	Long getId();
	String getName();
	String getProfileImage();
	String getBriefDescription();
	String getDescription();
	PetType getType();
	Set<Voter> getVoters();
}
