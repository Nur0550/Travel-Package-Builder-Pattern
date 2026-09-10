package main.java.builder;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        TravelPackageDirector director = new TravelPackageDirector();

        TravelPackageObjectBuilder objectBuilder = new TravelPackageObjectBuilder();
        director.makeWeekendParis(objectBuilder);
        TravelPackage parisPackage = objectBuilder.build();

        TravelPackageTextBuilder textBuilder = new TravelPackageTextBuilder();
        director.makeWeekendParis(textBuilder);
        String parisPreview = textBuilder.build();

        TravelPackageObjectBuilder tokyoObjectBuilder = new TravelPackageObjectBuilder();
        director.makeTokyoHoliday(tokyoObjectBuilder);
        TravelPackage tokyoPackage = tokyoObjectBuilder.build();

        System.out.println("OBJECT REPRESENTATION:");
        System.out.println(parisPackage);
        System.out.println();
        System.out.println("TEXT REPRESENTATION:");
        System.out.println(parisPreview);
        System.out.println();
        System.out.println("SECOND CONFIGURATION:");
        System.out.println(tokyoPackage);
    }
}
