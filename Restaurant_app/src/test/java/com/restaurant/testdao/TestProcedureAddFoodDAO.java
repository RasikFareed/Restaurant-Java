package com.restaurant.testdao;

import com.restaurant.dao.ProcedureAddFoodDAO;

public class TestProcedureAddFoodDAO {

	public static void main(String[] args) {

		ProcedureAddFoodDAO addFoodDao = new ProcedureAddFoodDAO();
		String status = addFoodDao.addFood("Porotta", "Dinner");
		System.out.println(status);
	}

}
