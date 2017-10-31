package com.duncol.mapstruct.main;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface MapstructInterface {
	
	@Mappings({
		@Mapping(source = "name", target = "firstName"),
		@Mapping(source = "name", target = "lastName"),
		@Mapping(source = "years", target = "age"),
		@Mapping(source = "date", target = "birthdate")
	})
	public DTO map(Entity e);
}
