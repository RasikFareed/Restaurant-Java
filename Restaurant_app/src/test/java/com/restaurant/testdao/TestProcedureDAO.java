package com.restaurant.testdao;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.restaurant.dao.ProcedureDAO;

public class TestProcedureDAO {

	public static void main(String[] args) {

		ProcedureDAO dao = new ProcedureDAO();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.ENGLISH);
		LocalTime time = LocalTime.now();
		String timeForm = formatter.format(time);

		String status = dao.placeOrder("seat8", "Variety Rice,Idly", "2,3", LocalTime.parse(timeForm));
		System.out.println(status);

	}

}
