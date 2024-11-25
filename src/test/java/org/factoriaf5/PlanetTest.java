package org.factoriaf5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PlanetTest {

    @Test
    void testConstructorAndAttributes() {
        Planet earth = new Planet(
                "Earth",
                1,
                5.972E24,
                1.08321E12,
                12742,
                150,
                TypeOfPlanet.TERRESTRIAL,
                true
        );

        assertEquals("Earth", earth.getName());
        assertEquals(1, earth.getNumberOfSatellites());
        assertEquals(5.972E24, earth.getMassKg());
        assertEquals(1.08321E12, earth.getVolumeKm3());
        assertEquals(12742, earth.getDiameterKm());
        assertEquals(150, earth.getDistanceFromSunMlnKm());
        assertEquals(TypeOfPlanet.TERRESTRIAL, earth.getType());
        assertTrue(earth.isObservable());
    }

    @Test
    void testDensityCalculation() {
        Planet earth = new Planet(
                "Earth",
                1,
                5.972E24,
                1.08321E12,
                12742,
                150,
                TypeOfPlanet.TERRESTRIAL,
                true
        );

        double expectedDensity = 5.972E24 / (1.08321E12 * 1.0E9);
        assertEquals(expectedDensity, earth.densityOfPlanet(), 1E-4);
    }

    @Test
    void testIsOuterPlanet() {
        Planet earth = new Planet(
            "Earth",
            1,
            5.97237e24, // Mass in kilograms
            1.08321e12, // Volume in cubic kilometers
            12742,      // Diameter in kilometers
            149,        // Distance from Sun in million kilometers
            TypeOfPlanet.TERRESTRIAL,
            true    
        );

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

        assertFalse(earth.isOuterPlanet());
        assertTrue(jupiter.isOuterPlanet());
    }

    @Test
    void testToString() {
        Planet earth = new Planet(
                "Earth",
                1,
                5.97237e24,
                1.08321E12,
                12742,
                1549,
                TypeOfPlanet.TERRESTRIAL,
                true
        );

        String planetInfo = earth.toString();
        System.out.println(planetInfo);
        assertTrue(planetInfo.contains("Earth"));
        assertTrue(planetInfo.contains("numberOfSatellites=1"));
        assertTrue(planetInfo.contains("volumeKm3=1.08321E12"));
        assertTrue(planetInfo.contains("distanceFromSunMlnKm=1549"));
    }

    @Test
    void testOrbitalAndRotationPeriod() {
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

        assertEquals(1.88, mars.getOrbitalPerioYears());
        assertEquals(1.03, mars.getRotationPeriodDays());
    }
}
