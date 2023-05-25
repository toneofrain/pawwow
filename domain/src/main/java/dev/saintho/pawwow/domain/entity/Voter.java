package dev.saintho.pawwow.domain.entity;

import dev.saintho.pawwow.utils.EmailValidator;

public class Voter {
	private final String email;

	public static Voter with(String email) {
		return new Voter(email);
	}

	public String getEmail() {
		return email;
	}

	private Voter(String email) {
		EmailValidator.validate(email);

		this.email = email;
	}
}
