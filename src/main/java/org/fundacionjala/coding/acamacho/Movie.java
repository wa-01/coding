package org.fundacionjala.coding.acamacho;

import java.util.HashMap;
import java.util.Map;

public class Movie {
    private String _title;
    private Category _category;

    public Movie(String title, Category category) {
        _title = title;
        _category = category;
    }

    public Category getCategory() {
        return _category;
    }

    public String getTitle() {
        return _title;
    }

    public double amountCategoryPrice(int daysRented){
        Map<Category, IPrice> categoryPrice = new HashMap<>();
        categoryPrice.put(Category.REGULAR, new RegularPrice());
        categoryPrice.put(Category.NEW_RELEASE, new NewReleasePrice());
        categoryPrice.put(Category.CHILDREN, new ChildrenPrice());

        return categoryPrice.get(_category).amount(daysRented);
    }
}
