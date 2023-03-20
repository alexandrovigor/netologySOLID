package org.example;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    private static final Map<String, Integer> products = new HashMap<>();

    static {
        products.put("Хлеб", 56);
        products.put("Масло", 153);
        products.put("Колбаса", 211);
        products.put("Пирожок", 45);
        products.put("Рыба", 123);
        products.put("Мясо", 368);
    }

    public static void productsMap() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }

    public static Map<String, Integer> getProducts() {
        return products;
    }
}
