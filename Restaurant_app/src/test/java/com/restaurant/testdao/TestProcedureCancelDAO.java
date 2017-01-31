package com.restaurant.testdao;

import com.restaurant.dao.ProcedureCancelDAO;

public class TestProcedureCancelDAO {

	public static void main(String[] args) {

		ProcedureCancelDAO cancelFoodDao = new ProcedureCancelDAO();
		String status = cancelFoodDao.cancelOrder(3, "seat8", "Idly");
		System.out.println(status);
	}

}
