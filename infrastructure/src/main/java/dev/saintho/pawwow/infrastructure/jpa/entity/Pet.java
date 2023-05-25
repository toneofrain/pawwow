package dev.saintho.pawwow.infrastructure.jpa.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import dev.saintho.pawwow.domain.entity.PetCandidatable;
import dev.saintho.pawwow.domain.entity.PetCandidate;
import dev.saintho.pawwow.domain.entity.PetType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Pet implements PetCandidatable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String profileImage;
	@Column(nullable = false)
	private String briefDescription;
	@Column(nullable = false)
	private String description;
	@Column(nullable = false, updatable = false)
	@Enumerated(EnumType.STRING)
	private PetType type;
	@Column(nullable = false, updatable = false)
	@CreatedDate
	private LocalDateTime createdAt;
	@Column(nullable = false)
	@LastModifiedDate
	private LocalDateTime lastModifiedAt;

	public static Pet from(PetCandidate petCandidate) {
		return new Pet(
			petCandidate.getName(),
			petCandidate.getProfileImage(),
			petCandidate.getBriefDescription(),
			petCandidate.getDescription(),
			petCandidate.getType());
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getProfileImage() {
		return profileImage;
	}

	@Override
	public String getBriefDescription() {
		return briefDescription;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public PetType getType() {
		return type;
	}

	private Pet(String name, String profileImage, String briefDescription, String description, PetType type) {
		this.name = name;
		this.profileImage = profileImage;
		this.briefDescription = briefDescription;
		this.description = description;
		this.type = type;
	}
}
