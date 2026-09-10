package main.java.builder;

public final class TravelPackage {
    private final String destination;
    private final int nights;
    private final String hotel;
    private final String transport;
    private final String mealPlan;
    private final boolean insurance;

    TravelPackage(String destination, int nights, String hotel,
                  String transport, String mealPlan, boolean insurance) {
        this.destination = destination;
        this.nights = nights;
        this.hotel = hotel;
        this.transport = transport;
        this.mealPlan = mealPlan;
        this.insurance = insurance;
    }

    public String getDestination() { return destination; }
    public int getNights() { return nights; }
    public String getHotel() { return hotel; }
    public String getTransport() { return transport; }
    public String getMealPlan() { return mealPlan; }
    public boolean hasInsurance() { return insurance; }

    @Override
    public String toString() {
        return "TravelPackage{" +
                "destination='" + destination + '\'' +
                ", nights=" + nights +
                ", hotel='" + hotel + '\'' +
                ", transport='" + transport + '\'' +
                ", mealPlan='" + mealPlan + '\'' +
                ", insurance=" + insurance +
                '}';
    }
}
