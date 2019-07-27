package movies;

public class RegulaMovie extends AbstractMovie {

    public RegulaMovie(String title){
        super(title, 2);
    }

    public double calculateAmount(int daysRented) {
        if (daysRented > 2)
            addToTotalAmount((daysRented - 2) * 1.5);
        return getAmount();
    }

}
