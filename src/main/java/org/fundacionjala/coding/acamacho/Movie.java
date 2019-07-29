package org.fundacionjala.coding.acamacho;

import java.util.HashMap;
import java.util.Map;

public class Movie {
    private String title;
    private Category category;

    public Movie(final String title, final Category category) {
        this.title = title;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public double amountCategoryPrice(int daysRented) {
        Map<Category, IPrice> categoryPrice = new HashMap<>();
        categoryPrice.put(Category.REGULAR, new RegularPrice());
        categoryPrice.put(Category.NEW_RELEASE, new NewReleasePrice());
        categoryPrice.put(Category.CHILDREN, new ChildrenPrice());

        return categoryPrice.get(category).amount(daysRented);
    }
}
