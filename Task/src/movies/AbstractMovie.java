package movies;

public abstract class AbstractMovie {
 private String _title;
 private int _priceCode;
 private int _frequentPoints;
 private double _amount;

 public AbstractMovie(String title, double amount){
     this._title = title;
     this._frequentPoints = 1;
     this._amount = amount;
 }

 public String getTitle(){
     return _title;
 }

 public int getPriceCode(){
     return _priceCode;
 }

 public int getFrequentPoint(){
     return _frequentPoints;
 }

 public void addFrequentPoints(int pointToAdd){
     _frequentPoints += pointToAdd;
 }

 public double getAmount(){
     return _amount;
 }

 public void addToTotalAmount(double amount){
     _amount += amount;
 }

 public abstract double calculateAmount(int daysRented);
}
