package luiscachi.movies;

class Rental {
    private AbstractMovie _movie;
    private int _daysRented;
    private double amount;


    public Rental(AbstractMovie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
        calculatePoints();
        calculateTotalAmount();
    }

    private void calculatePoints() {
        if( _movie instanceof NewReleaseMovie && _daysRented > 1){
            _movie.addFrequentPoints(1);
        }
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public AbstractMovie getMovie() {
        return _movie;
    }

    public int getFrequentPoint(){
        return _movie.getFrequentPoint();
    }

    private void calculateTotalAmount(){
        amount = _movie.calculateAmount(_daysRented);
    }

    public String toString(){
        return _movie.getTitle() + " " + getAmount();
    }

    public double getAmount(){
        return amount;
    }

}