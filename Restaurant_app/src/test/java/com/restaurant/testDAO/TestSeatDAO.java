package com.restaurant.testDAO;

import java.util.List;
import com.restaurant.DAO.*;

import com.restaurant.Seat;


public class TestSeatDAO {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		SeatDAO seatDAO = new SeatDAO();
		 List<Seat> list = seatDAO.list();
		for (Seat s : list) {
			System.out.println(s);
		}
	}

}