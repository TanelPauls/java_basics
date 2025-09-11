package week5;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    //Exercise 87.1
    public boolean larger(Apartment otherApartment){
        if(this.squareMeters > otherApartment.squareMeters){
            return true;
        }
        return false;
    }
    //Exercise 87.2
    public int priceDifference(Apartment otherApartment){
        return Math.abs(this.pricePerSquareMeter*this.squareMeters - otherApartment.pricePerSquareMeter*otherApartment.squareMeters);
    }
    //Exercise 87.3
    public boolean moreExpensiveThan(Apartment otherApartment){
        if(this.pricePerSquareMeter*this.squareMeters>otherApartment.pricePerSquareMeter*otherApartment.squareMeters){
            return true;
        }
        return false;
    }


}
