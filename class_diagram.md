```mermaid
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
        +String getName()
        +int getNumberOfSatellites()
        +double getMassKg()
        +double getVolumeKm3()
        +int getDiameterKm()
        +int getDistanceFromSunMlnKm()
        +TypeOfPlanet getType()
        +boolean isObservable()
        +double getOrbitalPerioYears()
        +double getRotationPeriodDays()
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
