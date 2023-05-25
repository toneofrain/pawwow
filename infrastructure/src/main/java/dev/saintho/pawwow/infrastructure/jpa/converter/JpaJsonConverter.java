package dev.saintho.pawwow.infrastructure.jpa.converter;

import org.springframework.aot.hint.TypeReference;

import com.google.gson.Gson;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.RequiredArgsConstructor;

@Converter
@RequiredArgsConstructor
public class JpaJsonConverter implements AttributeConverter<Object, String> {
	private final Gson gson;

	@Override
	public String convertToDatabaseColumn(Object attribute) {
		return gson.toJson(attribute);
	}

	@Override
	public Object convertToEntityAttribute(String dbData) {
		return gson.fromJson(dbData, Object.class);
	}
}
