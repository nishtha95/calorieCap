package com.caloriecap.dtos;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class MealDTO {

	@Getter
	@Setter
	private Date date;
	
	@Getter
	@Setter
	private String description;
	
	@Getter
	@Setter
	private int calorieCount;
	
}
