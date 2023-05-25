package dev.saintho.pawwow.domain.entity.vo;

import java.util.Objects;

import dev.saintho.pawwow.common.utils.EmailValidator;

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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Voter voter = (Voter)o;
		return Objects.equals(email, voter.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}
}
