package dev.saintho.pawwow.domain.exception;

public enum ExceptionCode {
	PET_NOT_FOUND(404, "PET_NOT_FOUND");

	private final Integer statusCode;
	private final String defaultMessage;

	public Integer getStatusCode() {
		return statusCode;
	}

	public String getDefaultMessage() {
		return defaultMessage;
	}

	ExceptionCode(int statusCode, String defaultMessage) {
		this.statusCode = statusCode;
		this.defaultMessage = defaultMessage;
	}
}
