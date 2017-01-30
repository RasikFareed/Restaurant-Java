package com.restaurant.testDAO;



import com.restaurant.DAO.ProcedureAddFoodDAO;


public class TestProcedureAddFoodDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcedureAddFoodDAO addFoodDao = new ProcedureAddFoodDAO();
		
		
			
		
		String status = addFoodDao.addFood("Porotta","Dinner","@add_message");
		System.out.println(status);
	}

}
