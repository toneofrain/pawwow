package dev.saintho.pawwow.infrastructure.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dev.saintho.pawwow.domain.entity.PetVote;
import dev.saintho.pawwow.domain.entity.Voter;
import dev.saintho.pawwow.domain.exception.DomainException;
import dev.saintho.pawwow.domain.exception.ExceptionCode;
import dev.saintho.pawwow.domain.repository.PetVoteRepository;
import dev.saintho.pawwow.infrastructure.jpa.dao.PetJpaDao;
import dev.saintho.pawwow.infrastructure.jpa.dao.PetPollJpaDao;
import dev.saintho.pawwow.infrastructure.jpa.entity.Pet;
import dev.saintho.pawwow.infrastructure.jpa.entity.PetPoll;
import lombok.RequiredArgsConstructor;

@Repository
@Transactional
@RequiredArgsConstructor
public class PetVoteRepositoryImpl implements PetVoteRepository {
	private final PetPollJpaDao petPollJpaDao;
	private final PetJpaDao petJpaDao;

	@Override
	@Transactional(readOnly = true)
	public Optional<PetVote> findByCandidateIdAndVoter(Long candidateId, Voter voter) {
		return petPollJpaDao.findByPetIdAndVoter(candidateId, voter)
			.map(petPoll -> PetVote.from(petPoll));
	}

	@Override
	public PetVote save(PetVote petVote) {
		Pet pet = petJpaDao.findById(petVote.getCandidateId())
			.orElseThrow(() -> new DomainException(ExceptionCode.PET_NOT_FOUND));

		PetPoll saved = petPollJpaDao.save(
			PetPoll.of(pet, petVote.getVoter()));

		return PetVote.from(saved);
	}

	@Override
	public void delete(PetVote petVote) {
		petPollJpaDao.deleteById(petVote.getId());
	}
}
