package org.factoriaf5;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {

    // In the main method of the App class, two planets must be created and the values of their attributes must be displayed on the screen. 
        // Planet mars = new Planet("Mars", 2, 6.4171e23, 1.6318e11, 6779, 228, TypeOfPlanet.TERRESTRIAL, true);
        // Planet saturn = new Planet("Saturn", 83, 5.6834e26, 8.2713e14, 116460, 1433, TypeOfPlanet.GASEOUS, true);
     
        Planet mars = new Planet("Mars", 2, 6.4171e23, 1.6318e11, 6779, 228, TypeOfPlanet.TERRESTRIAL, true, 1.88, 1.03);
        Planet saturn = new Planet("Saturn", 83, 5.6834e26, 8.2713e14, 116460, 1433, TypeOfPlanet.GASEOUS, true, 29.46, 0.45);
   // In addition, the density of each planet must be printed and whether the planet is an outer planet of the solar system.
        System.out.println("\n" + mars);
        System.out.println("The density of " + mars.getName() + ": " + mars.densityOfPlanet());
        System.out.println("Is " + mars.getName() + " in the asteroid belt? " + mars.isOuterPlanet());

        System.out.println("\n" +saturn);
        System.out.println("The density of " + saturn.getName() + ": " + saturn.densityOfPlanet());
        System.out.println("Is "+  saturn.getName() + " in the asteroid belt? " + saturn.isOuterPlanet() +"\n");
    }
}
