package dev.saintho.pawwow.domain.entity.query;

import java.util.Set;

import dev.saintho.pawwow.domain.entity.vo.PetType;
import dev.saintho.pawwow.domain.entity.vo.Voter;

public class PetDetail {
	private Long id;
	private String name;
	private String profileImage;
	private String briefDescription;
	private String description;
	private PetType type;
	private Set<Voter> voters;
}
