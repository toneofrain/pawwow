package dev.saintho.pawwow.infrastructure.jpa.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import dev.saintho.pawwow.domain.outbox.OutboxEventType;
import dev.saintho.pawwow.domain.outbox.PetOutboxEvent;
import dev.saintho.pawwow.infrastructure.jpa.converter.JpaJsonConverter;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class PetOutbox {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private Long petId;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private OutboxEventType type;
	@Column(nullable = false)
	@Convert(converter = JpaJsonConverter.class)
	private Object subject;
	@CreatedDate
	@Column(nullable = false, updatable = false)
	private LocalDateTime occurredAt;

	public static PetOutbox from(PetOutboxEvent event) {

		return new PetOutbox(
			event.getPetId(),
			event.getType(),
			event.getSubject());
	}

	private PetOutbox(Long petId, OutboxEventType type, Object subject) {
		this.petId = petId;
		this.type = type;
		this.subject = subject;
	}
}
