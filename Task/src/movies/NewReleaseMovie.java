package movies;

public class NewReleaseMovie extends AbstractMovie {


    public NewReleaseMovie(String title){
        super(title,0);
    }

    public void addFrequentPointsBonus(int bonus) {
        addFrequentPoints(bonus);
    }

    public double calculateAmount(int daysRented) {
        addToTotalAmount(daysRented * 3);
        return getAmount();
    }
}
