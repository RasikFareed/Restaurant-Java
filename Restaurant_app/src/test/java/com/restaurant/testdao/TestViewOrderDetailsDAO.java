package com.restaurant.testdao;

import java.util.Iterator;
import java.util.List;

import com.restaurant.dao.ViewOrderDetailsDAO;
import com.restaurant.model.ViewOrderDetails;

public class TestViewOrderDetailsDAO {

	public static void main(String[] args) {

		ViewOrderDetailsDAO viewOrderDetailsDao = new ViewOrderDetailsDAO();

		List<ViewOrderDetails> list = viewOrderDetailsDao.list();
		Iterator<ViewOrderDetails> i = list.iterator();
		while (i.hasNext()) {
			ViewOrderDetails viewOrderDetails = (ViewOrderDetails) i.next();
			System.out.println(viewOrderDetails.getOrderedId() + "\t" + viewOrderDetails.getSeatno() + "\t"
					+ viewOrderDetails.getOrderedItem() + "\t" + viewOrderDetails.getQuantity() + "\t"
					+ viewOrderDetails.getOrderedTime() + "\t" + viewOrderDetails.getOrderedDate() + "\t"
					+ viewOrderDetails.getState());
		}

	}

}
