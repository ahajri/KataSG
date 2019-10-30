package com.sg.ahajri.kata.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BasketItem {
    //Name of Basket Item
    String name;
    //Unit price
    double unitPrice;
    //count in basket
    int itemsCount;
    //Min group to apply discount
    int discountGroup;
    //priced item in min discount group
    int pricedInGroup;
    //total price withour discount
    double totalPrice;
    //discounted price
    double discountedPrice;

    public BasketItem(String name, double unitPrice, int itemsCount, int discountGroup, int pricedInGroup) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.itemsCount = itemsCount;
        this.discountGroup = discountGroup;
        this.pricedInGroup = pricedInGroup;
    }

    public double getTotalPrice() {
        return itemsCount * unitPrice;
    }

    public double getDiscountedPrice() {
        int result = discountGroup - Math.round(discountGroup / pricedInGroup);
        return unitPrice * (Math.round(discountGroup / pricedInGroup) + result);
    }

    public static void main(String[] args) {
        BasketItem apple = new BasketItem("Apple", 0.2, 4, 2, 1);
        BasketItem watermelon = new BasketItem("Watermelon", 0.8, 5, 3, 2);

    }
}
