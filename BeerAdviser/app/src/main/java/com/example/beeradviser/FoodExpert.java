package com.example.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class FoodExpert {
    public List<String> getMenu(String Meal) {
        List<String> Menu = new ArrayList<>();
        if (Meal.equals("breakfast")) {
            Menu.add("Roti");
            Menu.add("Dal");
            Menu.add("Egg");
        }
        else if (Meal.equals("lunch")) {
            Menu.add("Rice");
            Menu.add("Chicken");
            Menu.add("Fish");
        }
        else if (Meal.equals("dinner")) {
            Menu.add("Rice");
            Menu.add("Veg");
            Menu.add("Chicken");
        }
        return Menu;
    }
}