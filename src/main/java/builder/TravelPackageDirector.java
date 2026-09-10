package main.java.builder;

public final class TravelPackageDirector {
    private static final int WEEKEND_NIGHTS = 2;
    private static final int STANDARD_NIGHTS = 7;

    private static final String PARIS = "Paris";
    private static final String TOKYO = "Tokyo";
    private static final String THREE_STAR = "3-star hotel";
    private static final String FOUR_STAR = "4-star hotel";
    private static final String FLIGHT = "Flight";
    private static final String FLIGHT_AND_TRAIN = "Flight + train";
    private static final String BREAKFAST = "Breakfast";
    private static final String HALF_BOARD = "Half board";

    public void makeWeekendParis(TravelPackageBuilder builder) {
        builder.setDestination(PARIS)
                .setNights(WEEKEND_NIGHTS)
                .setHotel(THREE_STAR)
                .setTransport(FLIGHT)
                .setMealPlan(BREAKFAST)
                .setInsurance(true);
    }

    public void makeTokyoHoliday(TravelPackageBuilder builder) {
        builder.setDestination(TOKYO)
                .setNights(STANDARD_NIGHTS)
                .setHotel(FOUR_STAR)
                .setTransport(FLIGHT_AND_TRAIN)
                .setMealPlan(HALF_BOARD)
                .setInsurance(true);
    }
}
