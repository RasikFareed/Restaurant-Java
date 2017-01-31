package com.restaurant.testdao;

import java.util.List;

import com.restaurant.dao.*;
import com.restaurant.model.*;

public class TestFoodTypeDAO {

	public static void main(String[] args) {
		
		FoodTypeDAO foodTypeDAO = new FoodTypeDAO();
		 List<FoodType> list = foodTypeDAO.list();
		for (FoodType s : list) {
			System.out.println(s);
		}
	}

}
