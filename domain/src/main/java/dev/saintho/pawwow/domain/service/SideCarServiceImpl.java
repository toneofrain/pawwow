package dev.saintho.pawwow.domain.service;

import org.springframework.stereotype.Service;

import dev.saintho.pawwow.domain.repository.SideCarRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SideCarServiceImpl implements SideCarService {
	private final SideCarRepository sideCarRepository;

	@Override
	public void init() {
		System.out.println("Hello Domain!");
		sideCarRepository.init();
	}
}
