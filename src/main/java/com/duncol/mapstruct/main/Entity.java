package com.duncol.mapstruct.main;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Entity {
	private String name;
	private long years;
	private Date date;
}
