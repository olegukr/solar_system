package org.factoriaf5;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {

    // In the main method of the App class, two planets must be created and the values of their attributes must be displayed on the screen. 
     
    Planet venera = new Planet(
            "Venus",
            0,
            4.8675e24, // Mass in kilograms
            9.2843e11, // Volume in cubic kilometers
            12104,     // Diameter in kilometers
            108,       // Distance from Sun in million kilometers
            TypeOfPlanet.TERRESTRIAL,
            true       // Observable with naked eye
    );

    // Create Earth
    Planet earth = new Planet(
        "Earth",
        1,
        5.97237e24, // Mass in kilograms
        1.08321e12, // Volume in cubic kilometers
        12742,      // Diameter in kilometers
        149,        // Distance from Sun in million kilometers
        TypeOfPlanet.TERRESTRIAL,
        true        // Observable with naked eye
        );

    // Create Jupiter (Yupiter)
    Planet jupiter = new Planet(
        "Jupiter",
        79,
        1.8982e27,  // Mass in kilograms
        1.43128e15, // Volume in cubic kilometers
        139820,     // Diameter in kilometers
        778,        // Distance from Sun in million kilometers
        TypeOfPlanet.GASEOUS,
        true        // Observable with naked eye
        );

    // Display attributes of Venus (Venera)
    venera.showPlanet();
    earth.showPlanet();
    jupiter.showPlanet();


    Planet mars = new Planet(
        "Mars", 
        2, 
        6.4171e23, 
        1.6318e11, 
        6779, 
        228, 
        TypeOfPlanet.TERRESTRIAL, 
        true, 
        1.88, 
        1.03
        );

    Planet saturn = new Planet(
        "Saturn", 
        83, 
        5.6834e26, 
        8.2713e14, 
        116460, 
        1433, 
        TypeOfPlanet.GASEOUS, 
        true, 
        29.46, 
        0.45
        );

    mars.showPlanet();
    saturn.showPlanet();  

    }
}
