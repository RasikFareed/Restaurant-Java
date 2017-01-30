package com.restaurant.testDAO;

import java.util.List;
import com.restaurant.DAO.*;
import com.restaurant.SeatStatus;


public class TestSeatStatusDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeatStatusDAO seatStatusDAO = new SeatStatusDAO();
		 List<SeatStatus> list = seatStatusDAO.list();
		for (SeatStatus s : list) {
			System.out.println(s);
		}
	}

}
