package dev.saintho.pawwow.sidecar.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.saintho.pawwow.domain.service.SideCarService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/images")
@RequiredArgsConstructor
public class SideCarController {
	private final SideCarService sideCarService;

	@GetMapping
	public ResponseEntity<String> test() {
		sideCarService.init();

		return ResponseEntity.ok("Ok!!");
	}
}
