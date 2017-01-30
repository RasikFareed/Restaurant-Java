package com.restaurant.testDAO;


import com.restaurant.DAO.ProcedureCancelDAO;

public class TestProcedureCancelDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProcedureCancelDAO cancelFoodDao = new ProcedureCancelDAO();
		
		
			
		
		String status = cancelFoodDao.cancelOrder(1,"seat8","North Indian Thali","@cancel_message");
		System.out.println(status);
	}

}
