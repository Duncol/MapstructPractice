package com.duncol.mapstruct.main.test;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import com.duncol.mapstruct.main.DTO;
import com.duncol.mapstruct.main.Entity;
import com.duncol.mapstruct.main.MapstructInterface;

public class MainTest {
	
	@Test
	public void mapstructTest() {
		Date now = new Date();
		MapstructInterface mapper = Mappers.getMapper(MapstructInterface.class);
		Entity e = new Entity("Damian Dunajski", 27L, now);
		DTO dto = mapper.map(e);
		assertEquals(dto.getFirstName(), "Damian Dunajski");
		assertEquals(dto.getAge(), 27L);
		assertEquals(dto.getBirthdate(), dateToCalendar(now));
	}
	
	private Calendar dateToCalendar(Date d) {
		Calendar now = Calendar.getInstance();
		now.setTime(d);
		return now;
	}
}
