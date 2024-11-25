classDiagram
    class App {
        +main(String[] args)
    }

    class Planet {
        +final double asteroidBeltStartAU
        +final double asteroidBeltFinishAU
        +final double oneAUinKm
        +String name
        +int numberOfSatellites
        +double massKg
        +double volumeKm3
        +int diameterKm
        +int distanceFromSunMlnKm
        +TypeOfPlanet type
        +boolean observable
        +double orbitalPerioYears
        +double rotationPeriodDays
        +Planet(String name, int numberOfSatellites, double massKg, double volumeKm3, 
                 int diameterKm, int distanceFromSunMlnKm, TypeOfPlanet type, boolean observable)
        +Planet(String name, int numberOfSatellites, double massKg, double volumeKm3, 
                 int diameterKm, int distanceFromSunMlnKm, TypeOfPlanet type, boolean observable, 
                 double orbitalPerioYears, double rotationPeriodDays)
        +double densityOfPlanet()
        +boolean isOuterPlanet()
        +String toString()
        +void validateAttributes()
    }

    class TypeOfPlanet {
        <<enumeration>>
        GASEOUS
        TERRESTRIAL
        DWARF
    }

    %% Relationships
    App --> Planet : uses
    Planet --> TypeOfPlanet : uses
