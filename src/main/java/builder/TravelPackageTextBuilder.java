package main.java.builder;

public final class TravelPackageTextBuilder implements TravelPackageBuilder {
    private String destination;
    private int nights;
    private String hotel;
    private String transport;
    private String mealPlan;
    private boolean insurance;

    @Override
    public TravelPackageTextBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    @Override
    public TravelPackageTextBuilder setNights(int nights) {
        this.nights = nights;
        return this;
    }

    @Override
    public TravelPackageTextBuilder setHotel(String hotel) {
        this.hotel = hotel;
        return this;
    }

    @Override
    public TravelPackageTextBuilder setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    @Override
    public TravelPackageTextBuilder setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
        return this;
    }

    @Override
    public TravelPackageTextBuilder setInsurance(boolean insurance) {
        this.insurance = insurance;
        return this;
    }

    public String build() {
        validate();
        return "=== Travel Package ===\n" +
                "Destination: " + destination + "\n" +
                "Nights: " + nights + "\n" +
                "Hotel: " + hotel + "\n" +
                "Transport: " + transport + "\n" +
                "Meal plan: " + mealPlan + "\n" +
                "Insurance: " + (insurance ? "included" : "not included");
    }

    private void validate() {
        if (isBlank(destination)) {
            throw new IllegalStateException("Destination is required");
        }
        if (nights <= 0) {
            throw new IllegalStateException("Nights must be greater than zero");
        }
        if (isBlank(hotel)) {
            throw new IllegalStateException("Hotel is required");
        }
        if (isBlank(transport)) {
            throw new IllegalStateException("Transport is required");
        }
        if (isBlank(mealPlan)) {
            throw new IllegalStateException("Meal plan is required");
        }
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }
}
