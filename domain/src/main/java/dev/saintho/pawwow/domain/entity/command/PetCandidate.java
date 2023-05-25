package dev.saintho.pawwow.domain.entity.command;

import dev.saintho.pawwow.domain.entity.vo.PetType;
import dev.saintho.pawwow.domain.entity.command.PetCandidatable;

public class PetCandidate {
	private Long id;
	private String name;
	private String profileImage;
	private String briefDescription;
	private String description;
	private final PetType type;

	public static PetCandidate from(PetCandidatable petCandidatable) {
		return new PetCandidate(
			petCandidatable.getId(),
			petCandidatable.getName(),
			petCandidatable.getProfileImage(),
			petCandidatable.getBriefDescription(),
			petCandidatable.getDescription(),
			petCandidatable.getType());
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public String getBriefDescription() {
		return briefDescription;
	}

	public String getDescription() {
		return description;
	}

	public PetType getType() {
		return type;
	}

	private PetCandidate(Long id, String name, String profileImage, String briefDescription, String description,
		PetType type) {
		this.id = id;
		this.name = name;
		this.profileImage = profileImage;
		this.briefDescription = briefDescription;
		this.description = description;
		this.type = type;
	}
}
