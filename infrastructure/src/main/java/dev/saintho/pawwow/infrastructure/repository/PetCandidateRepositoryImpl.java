package dev.saintho.pawwow.infrastructure.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dev.saintho.pawwow.domain.entity.PetCandidate;
import dev.saintho.pawwow.domain.exception.DomainException;
import dev.saintho.pawwow.domain.exception.ExceptionCode;
import dev.saintho.pawwow.domain.repository.PetCandidateRepository;
import dev.saintho.pawwow.infrastructure.jpa.dao.PetJpaDao;
import dev.saintho.pawwow.infrastructure.jpa.entity.Pet;
import lombok.RequiredArgsConstructor;

@Repository
@Transactional
@RequiredArgsConstructor
public class PetCandidateRepositoryImpl implements PetCandidateRepository {
	private final PetJpaDao petJpaDao;

	@Override
	@Transactional(readOnly = true)
	public PetCandidate findVerifiedOneById(Long id) {
		return petJpaDao.findById(id)
			.map(pet -> PetCandidate.from(pet))
			.orElseThrow(() -> new DomainException(ExceptionCode.PET_NOT_FOUND));
	}

	@Override
	public PetCandidate save(PetCandidate petCandidate) {
		Pet saved = petJpaDao.save(
			Pet.from(petCandidate));

		return PetCandidate.from(saved);
	}
}
