package luiscachi.movies;

public class NewReleaseMovie extends AbstractMovie {


    public NewReleaseMovie(String title){
        super(title,0);
    }

    public double calculateAmount(int daysRented) {
        addToTotalAmount(daysRented * 3);
        return getAmount();
    }
}
