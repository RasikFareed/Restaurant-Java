package com.restaurant;
import lombok.*;
import java.time.LocalTime;

@Data
public class FoodType {
	private int foodTypeId;
	private String foodType;
	private LocalTime fromTime;
	private LocalTime toTime;
	private int quantity;
	
}
