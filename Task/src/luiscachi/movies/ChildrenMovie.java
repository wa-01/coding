package luiscachi.movies;

public class ChildrenMovie extends AbstractMovie {

    private ChildrenMovie(String title, int priceCode){
        super(title, 1.5);
    }

    public double calculateAmount(int daysRented) {
        if (daysRented > 3)
            addToTotalAmount((daysRented - 3) * 1.5);
        return getAmount();
    }
}
