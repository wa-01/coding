package org.fundacionjala.coderefactoring;

public abstract class AbsMovie {
    private String title;

    public AbsMovie(final String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }

    public abstract double getPrice(int rentedDays);
}
