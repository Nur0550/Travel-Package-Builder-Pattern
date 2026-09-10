# Assignment 1 — Builder Pattern

## Product
Travel Package

## Pattern idea
The project demonstrates the Builder design pattern. A `TravelPackageDirector` contains reusable construction recipes, while two concrete builders create different representations from the same construction steps:

1. `TravelPackageObjectBuilder` → immutable `TravelPackage` object.
2. `TravelPackageTextBuilder` → formatted `String` preview.

## Requirements covered
- Fluent API: every builder step returns `this`.
- Builder interface: `TravelPackageBuilder`.
- Two concrete builders with different result types.
- Director with two ready configurations.
- Immutable product with final fields and no setters.
- Validation in both `build()` methods.
- Constants instead of magic values in the Director.
- No giant constructors exposed to the client.

## Project structure
```text
src/main/java/builder/
├── Main.java
├── TravelPackage.java
├── TravelPackageBuilder.java
├── TravelPackageObjectBuilder.java
├── TravelPackageTextBuilder.java
└── TravelPackageDirector.java
```

## How to run
Requires Java 11+.

```bash
javac -d out src/main/java/builder/*.java
java -cp out builder.Main
```

## Expected output
```text
OBJECT REPRESENTATION:
TravelPackage{destination='Paris', nights=2, hotel='3-star hotel', transport='Flight', mealPlan='Breakfast', insurance=true}

TEXT REPRESENTATION:
=== Travel Package ===
Destination: Paris
Nights: 2
Hotel: 3-star hotel
Transport: Flight
Meal plan: Breakfast
Insurance: included

SECOND CONFIGURATION:
TravelPackage{destination='Tokyo', nights=7, hotel='4-star hotel', transport='Flight + train', mealPlan='Half board', insurance=true}
```
