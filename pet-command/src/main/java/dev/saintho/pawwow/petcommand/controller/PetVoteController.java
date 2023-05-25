package dev.saintho.pawwow.petcommand.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.saintho.pawwow.service.SideCarService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/pets/{petId:[0-9]+}/poll")
@RequiredArgsConstructor
public class PetVoteController {
	private final SideCarService sideCarService;

	@GetMapping
	public ResponseEntity<String> test() {
		sideCarService.init();

		return ResponseEntity.ok("Ok!!");
	}
}
