package com.restaurant.testDAO;

import java.util.Iterator;
import java.util.List;

import com.restaurant.ViewOrderDetails;
import com.restaurant.DAO.ViewOrderDetailsDAO;

public class TestViewOrderDetailsDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ViewOrderDetailsDAO viewOrderDetailsDao = new ViewOrderDetailsDAO();
		
		List<ViewOrderDetails> list=viewOrderDetailsDao.list();
		Iterator<ViewOrderDetails> i=list.iterator();
		while(i.hasNext())
		{
			ViewOrderDetails viewOrderDetails=(ViewOrderDetails)i.next();
			System.out.println(viewOrderDetails.getOrderedId()+"\t"+viewOrderDetails.getSeatno()+"\t"+viewOrderDetails.getOrderedItem()+"\t"+viewOrderDetails.getQuantity()+"\t"+viewOrderDetails.getOrderedTime()+"\t"+viewOrderDetails.getOrderedDate()+"\t"+viewOrderDetails.getState());
		}

	}

}
