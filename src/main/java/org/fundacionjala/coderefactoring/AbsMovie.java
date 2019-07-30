package org.fundacionjala.coderefactoring;

public abstract class AbsMovie {
    private String title;

    public AbsMovie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract double getPrice(int rentedDays);
}
