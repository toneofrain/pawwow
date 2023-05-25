package dev.saintho.pawwow.infrastructure.jpa.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import dev.saintho.pawwow.domain.entity.vo.Voter;
import dev.saintho.pawwow.infrastructure.jpa.entity.PetPoll;

public interface PetPollJpaDao extends CrudRepository<PetPoll, Long> {
	Optional<PetPoll> findByPetIdAndVoter(Long petId, Voter voter);
}
