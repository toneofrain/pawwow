package dev.saintho.pawwow.infrastructure.jpa.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import dev.saintho.pawwow.domain.entity.PetCandidate;
import dev.saintho.pawwow.domain.entity.PetVotable;
import dev.saintho.pawwow.domain.entity.PetVote;
import dev.saintho.pawwow.domain.entity.Voter;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PetPoll implements PetVotable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	@Embedded
	private Voter voter;
	@Column(nullable = false, updatable = false)
	@CreatedDate
	private LocalDateTime createdAt;

	@ManyToOne
	@JoinColumn(name = "pet_id")
	private Pet pet;

	public static PetPoll of(Pet pet, Voter voter) {
		return new PetPoll(pet, voter);
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public Long getCandidateId() {
		return pet.getId();
	}

	@Override
	public Voter getVoter() {
		return voter;
	}

	private PetPoll(Pet pet, Voter voter) {
		this.pet = pet;
		this.voter = voter;
	}
}
