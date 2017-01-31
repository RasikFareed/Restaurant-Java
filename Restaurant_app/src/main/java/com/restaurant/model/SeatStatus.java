package com.restaurant.model;

import lombok.*;

@Data
public class SeatStatus {
	private int statusId;
	private Seat seatNo;
	private String seatState;
	private boolean concurrent_user_state;
}
