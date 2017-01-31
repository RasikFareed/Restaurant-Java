package com.restaurant.testdao;

import java.util.List;

import com.restaurant.dao.*;
import com.restaurant.model.SeatStatus;

public class TestSeatStatusDAO {

	public static void main(String[] args) {

		SeatStatusDAO seatStatusDAO = new SeatStatusDAO();
		List<SeatStatus> list = seatStatusDAO.list();
		for (SeatStatus s : list) {
			System.out.println(s);
		}
	}

}
