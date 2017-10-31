package com.duncol.mapstruct.main;

import java.util.Calendar;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DTO {
	private String firstName;
	private String lastName;
	private int age;
	private Calendar birthdate;
}
