package com.restaurant.testdao;

import java.util.List;

import com.restaurant.dao.*;
import com.restaurant.model.Seat;

public class TestSeatDAO {

	public static void main(final String[] args) {

		SeatDAO seatDAO = new SeatDAO();
		List<Seat> list = seatDAO.list();
		for (Seat s : list) {
			System.out.println(s);
		}
	}

}