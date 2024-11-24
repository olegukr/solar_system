package org.factoriaf5;

/***
    A planet has the following attributes:
•	A String name with an initial value of null.
•	Number of satellites of type int with initial value of zero.
•	Mass in kilograms of type double with initial value of zero.
•	Volume in cubic kilometers of type double with initial value of zero.
•	Diameter in kilometers of type int with initial value of zero.
•	Mean distance from the Sun in millions of kilometers, of type int with initial value zero.
•	Type of planet according to its size, of enumerated type with the following possible values: GASEOUS, TERRESTRIAL and DWARF.
•	Observable to the naked eye, of boolean type with initial value false.

 ***/

/***
methods:
•	The class must have a constructor that initializes the values of its respective attributes.
•	Define a method that returns the values of a planet's attributes.
•	Calculate the density of the planet, as the quotient between its mass and its volume.
•	Determine whether a planet in the solar system is considered outer.
•	An outer planet is located beyond the asteroid belt. The asteroid belt is located between 2.1 and 3.4 AU. One astronomical unit (AU) is the distance from Earth to the Sun = 1,495,978,70 km.
•	In the main method of the App class, two planets must be created and the values of their attributes must be displayed on the screen. In addition, the density of each planet must be printed and whether the planet is an outer planet of the solar system.
***/

public class Planet {


final double asteroidBeltStartAU = 2.1;
final double asteroidBeltFinishAU = 3.4;
final double oneAUinKm = 149597870;


    String name;
    int numberOfSatellites = 0;
    double massKg = 0;
    double volumeKm3 = 0;
    int diameterKm = 0;
    int distanceFromSunMlnKm = 0;
    TypeOfPlanet type;
    boolean observable;

    double orbitalPerioYears;
    double rotationPeriodDays;


    //•	The class must have a constructor that initializes the values of its respective attributes.

    public Planet(String name, int number_of_satellites, double massKg, double volumeKm3, int diameterKm,
            int distanceFromSunMlnKm, TypeOfPlanet type, boolean observable) {
        this.name = name;
        this.numberOfSatellites = number_of_satellites;
        this.massKg = massKg;
        this.volumeKm3 = volumeKm3;
        this.diameterKm = diameterKm;
        this.distanceFromSunMlnKm = distanceFromSunMlnKm;
        this.type = type;
        this.observable = observable; 

    }

    public Planet(String name, int number_of_satellites, double massKg, double volumeKm3, int diameterKm,
    int distanceFromSunMlnKm, TypeOfPlanet type, boolean observable, double  orbitalPerioYears, double rotationPeriodDays) {
        this.name = name;
        this.numberOfSatellites = number_of_satellites;
        this.massKg = massKg;
        this.volumeKm3 = volumeKm3;
        this.diameterKm = diameterKm;
        this.distanceFromSunMlnKm = distanceFromSunMlnKm;
        this.type = type;
        this.observable = observable; 
        this.orbitalPerioYears = orbitalPerioYears;
        this.rotationPeriodDays = rotationPeriodDays;

}




    // •	Define a method that returns the values of a planet's attributes.

    public double getAsteroidBeltStartAU() {
        return asteroidBeltStartAU;
    }

    public double getAsteroidBeltFinishAU() {
        return asteroidBeltFinishAU;
    }

    public double getOneAUinKm() {
        return oneAUinKm;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public double getMassKg() {
        return massKg;
    }

    public double getVolumeKm3() {
        return volumeKm3;
    }

    public int getDiameterKm() {
        return diameterKm;
    }

    public int getDistanceFromSunMlnKm() {
        return distanceFromSunMlnKm;
    }

    public TypeOfPlanet getType() {
        return type;
    }

    public boolean isObservable() {
        return observable;
    }

   // •	Calculate the density of the planet, as the quotient between its mass and its volume.
    public double densityOfPlanet() {
       return this.massKg/(this.volumeKm3 * 1000);
    }

    // •	Determine whether a planet in the solar system is considered outer.
    public boolean isOuterPlanet() {
        return (this.distanceFromSunMlnKm/(oneAUinKm/1000000)) > asteroidBeltFinishAU;

   }

//    @Override
//    public String toString() {
//        return "Planet{" +
//                "name='" + name + '\'' +
//                ", numberOfSatellites=" + numberOfSatellites +
//                ", massKg=" + massKg +
//                ", volumeKm3=" + volumeKm3 +
//                ", diameterKm=" + diameterKm +
//                ", distanceFromSunMlnKm=" + distanceFromSunMlnKm +
//                ", type=" + type +
//                ", observable=" + observable +
//                '}';

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", numberOfSatellites=" + numberOfSatellites +
                ", massKg=" + massKg +
                ", volumeKm3=" + volumeKm3 +
                ", diameterKm=" + diameterKm +
                ", distanceFromSunMlnKm=" + distanceFromSunMlnKm +
                ", type=" + type +
                ", observable=" + observable +
                ", OrbitalPerioYears=" +orbitalPerioYears +
                ", RotationPeriodDays=" + rotationPeriodDays+
                           '}';
   }

    public double getOrbitalPerioYears() {
        return orbitalPerioYears;
    }

    public double getRotationPeriodDays() {
        return rotationPeriodDays;
    }
}
