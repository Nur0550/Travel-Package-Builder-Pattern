package main.java.builder;

public final class TravelPackageObjectBuilder implements TravelPackageBuilder {
    private String destination;
    private int nights;
    private String hotel;
    private String transport;
    private String mealPlan;
    private boolean insurance;

    @Override
    public TravelPackageObjectBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    @Override
    public TravelPackageObjectBuilder setNights(int nights) {
        this.nights = nights;
        return this;
    }

    @Override
    public TravelPackageObjectBuilder setHotel(String hotel) {
        this.hotel = hotel;
        return this;
    }

    @Override
    public TravelPackageObjectBuilder setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    @Override
    public TravelPackageObjectBuilder setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
        return this;
    }

    @Override
    public TravelPackageObjectBuilder setInsurance(boolean insurance) {
        this.insurance = insurance;
        return this;
    }

    public TravelPackage build() {
        validate();
        return new TravelPackage(destination, nights, hotel, transport, mealPlan, insurance);
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
