package com.sg.ahajri.kata.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString(exclude = "basketItems")
public class Basket {
    private List<BasketItem> basketItems;
    private double totalPrice;
    private double totalPriceWithoutDiscount;

    public Basket() {
        basketItems = new ArrayList<>();
    }

    public Basket(List<BasketItem> basketItems) {

        this.basketItems = basketItems;
    }

    public void addItem(BasketItem item, int count) {
        for (int i = 1; i < count; i++) {
            this.basketItems.add(item);
        }
    }

    public void addToTotalPrice(double price) {
        this.totalPrice = totalPrice + price;
    }

    public void totalProceWithoutDiscount() {
        if (CollectionUtils.isNotEmpty(basketItems)) {
            totalPriceWithoutDiscount = basketItems.stream().mapToDouble(i -> i.itemsCount * i.unitPrice).sum();
        }
    }
}
