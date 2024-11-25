package org.factoriaf5;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class AppTest {
    
    @Test
    void testPlanetDisplay() {
        // Redirect standard output to capture the display
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            // Create a planet and call showPlanet()
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

            earth.showPlanet();

            // Capture the output
            String output = outputStream.toString();

            // Assertions
            assertTrue(output.contains("Earth"));
            assertTrue(output.contains("The density of Earth:"));
            assertTrue(output.contains("Is Earth an outer planet? false"));

        } finally {
            // Restore standard output
            System.setOut(originalOut);
        }
    }

    @Test
    void testMainMethod() {
        // Redirect standard output to capture the display
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            // Call the main method
            App.main(new String[]{});

            // Capture the output
            String output = outputStream.toString();

            // Assertions
            assertTrue(output.contains("Venus"));
            assertTrue(output.contains("Earth"));
            assertTrue(output.contains("Jupiter"));
            assertTrue(output.contains("Mars"));
            assertTrue(output.contains("Saturn"));

            assertTrue(output.contains("The density of Venus:"));
            assertTrue(output.contains("The density of Earth:"));
            assertTrue(output.contains("The density of Jupiter:"));
            assertTrue(output.contains("The density of Mars:"));
            assertTrue(output.contains("The density of Saturn:"));

        } finally {
            // Restore standard output
            System.setOut(originalOut);
        }
    }
}
    


