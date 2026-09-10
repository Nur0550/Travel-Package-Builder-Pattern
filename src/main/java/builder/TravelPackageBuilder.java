package main.java.builder;

public interface TravelPackageBuilder {
    TravelPackageBuilder setDestination(String destination);
    TravelPackageBuilder setNights(int nights);
    TravelPackageBuilder setHotel(String hotel);
    TravelPackageBuilder setTransport(String transport);
    TravelPackageBuilder setMealPlan(String mealPlan);
    TravelPackageBuilder setInsurance(boolean insurance);
}
