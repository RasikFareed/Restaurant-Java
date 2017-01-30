package com.restaurant.testDAO;

import java.util.List;

import com.restaurant.*;
import com.restaurant.DAO.*;

public class TestFoodTypeDAO {

	public static void main(String[] args) {
		
		FoodTypeDAO foodTypeDAO = new FoodTypeDAO();
		 List<FoodType> list = foodTypeDAO.list();
		for (FoodType s : list) {
			System.out.println(s);
		}
	}

}
