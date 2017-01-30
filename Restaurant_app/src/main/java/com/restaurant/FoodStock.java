package com.restaurant;

import lombok.*;

@Data
public class FoodStock {
	private int foodStockId;
	private Menu menuListId;
	private FoodType foodTypeId;
	private int stockQuantity;
}
