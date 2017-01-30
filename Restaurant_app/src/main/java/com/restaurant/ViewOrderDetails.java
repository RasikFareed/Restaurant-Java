package com.restaurant;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

@Data
public class ViewOrderDetails {

	private int id;
	private int orderedId;
	private String seatno;
	private String orderedItem;
	private int quantity;
	private LocalTime orderedTime;
	private LocalDate orderedDate;
	private String state;
}
