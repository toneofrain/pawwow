package dev.saintho.pawwow.infrastructure.repository;

import org.springframework.stereotype.Repository;

import dev.saintho.pawwow.domain.repository.SideCarRepository;

@Repository
public class SideCarRepositoryImpl implements SideCarRepository {
	@Override
	public void init() {
		System.out.println("Hello Infrastructure!!");
	}
}
