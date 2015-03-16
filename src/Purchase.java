/**
 * Created by Denis on 10.02.15.
 */

public class Purchase implements Comparable <Purchase> {

    private String commodityName;
    private int price;
    int numberUnit;
    private Weekday day;

    public Purchase(){
        super();
    }

    public Purchase(String commodityName, int price, int numberUnit, Weekday day) {
        this.commodityName = commodityName;
        this.price = price;
        this.numberUnit = numberUnit;
        this.day = day;
    }


    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberUnit() {
        return numberUnit;
    }

    public void setNumberUnit(int numberUnit) {
        this.numberUnit = numberUnit;
    }

    public Weekday getDay() {
        return day;
    }

    public void setDay(Weekday day) {
        this.day = day;
    }

    public int getCost(){
        return numberUnit*price;
    }

    @Override
    public String toString() {
        return commodityName + ";" + price + ";" + numberUnit + ";" + day + ";"
                + getCost() + ";";
    }

    @Override
    public int compareTo(Purchase purchase) {
        return getCost() - purchase.getCost();
    }

    public String indexDay (int index){

        switch (index){
            case 0:
                return Weekday.Monday.toString();
            case 1:
                return Weekday.Tuesday.toString();
            case 2:
                return Weekday.Wednesday.toString();
            case 3:
                return Weekday.Thursday.toString();
            case 4:
                return Weekday.Friday.toString();
            case 5:
                return Weekday.Saturday.toString();
            case 6:
                return Weekday.Sunday.toString();
            default:
                return "";
        }
    }
}
