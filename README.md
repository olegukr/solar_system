
 # Solar System (*67)


Giacomo F5 Classroom
•
November 18th.
Backend: Java
•
100 balls
Prices: 25 нояб.
A program is required that models the concept of a planet in the solar system.

A planet has the following attributes:
•	A String name with an initial value of null.
•	Number of satellites of type int with initial value of zero.
•	Mass in kilograms of type double with initial value of zero.
•	Volume in cubic kilometers of type double with initial value of zero.
•	Diameter in kilometers of type int with initial value of zero.
•	Mean distance from the Sun in millions of kilometers, of type int with initial value zero.
•	Type of planet according to its size, of enumerated type with the following possible values: GASEOUS, TERRESTRIAL and DWARF.
•	Observable to the naked eye, of boolean type with initial value false.


The class must include the following methods:
•	The class must have a constructor that initializes the values of its respective attributes.
•	Define a method that returns the values of a planet's attributes.
•	Calculate the density of the planet, as the quotient between its mass and its volume.
•	Determine whether a planet in the solar system is considered outer.
•	An outer planet is located beyond the asteroid belt. The asteroid belt is located between 2.1 and 3.4 AU. One astronomical unit (AU) is the distance from Earth to the Sun = 1,495,978,70 km.
•	In the main method of the App class, two planets must be created and the values of their attributes must be displayed on the screen. 
    In addition, the density of each planet must be printed and whether the planet is an outer planet of the solar system.
Extension:

•	Add two attributes to the Planet class. The first should represent the planet's orbital period (in years). The second attribute represents the rotation period (in days).
•	Modify the class constructor to initialize the values of these two new attributes.
•	Modify the print method to display the values of the new attributes on the screen.
Requirements:
•	The planet class must be tested. (Minimum 70% coverage)
•	The Readme should show the class diagram
Deliverables:
•	Link to Github repository
•	Screenshot of the "Testing" section of Visual Studio Code where the coverage of the tests can be seen
 


------

 # Sistema Solar (*67)
 
Giacomo F5 Classroom
•
18 нояб.
Backend: Java
•
100 баллов
Срок сдачи: 25 нояб.
Se requiere un programa que modele el concepto de un planeta del sistema solar.

Un planeta tiene los siguientes atributos:
•	Un nombre de tipo String con valor inicial de null.
•	Cantidad de satélites de tipo int con valor inicial de cero.
•	Masa en kilogramos de tipo double con valor inicial de cero.
•	Volumen en kilómetros cúbicos de tipo double con valor inicial de cero.
•	Diámetro en kilómetros de tipo int con valor inicial de cero.
•	Distancia media al Sol en millones de kilómetros, de tipo int con valor inicial de cero.
•	Tipo de planeta de acuerdo con su tamaño, de tipo enumerado con los siguientes valores posibles: GASEOSO, TERRESTRE y ENANO.
•	Observable a simple vista, de tipo booleano con valor inicial false.


La clase debe incluir los siguientes métodos:
•	La clase debe tener un constructor que inicialice los valores de sus respectivos atributos.
•	Definir un método que devuelva los valores de los atributos de un planeta.
•	Calcular la densidad del planeta, como el cociente entre su masa y su volumen.
•	Determinar si un planeta del sistema solar se considera exterior.
•	Un planeta exterior está situado más allá del cinturón de asteroides. El cinturón de asteroides se encuentra entre 2.1 y 3.4 UA. Una unidad astronómica (UA) es la distancia entre la Tierra y el Sol = 149597870 Km.
•	En el método main de la clase App se deben crear dos planetas y mostrar los valores de sus atributos en pantalla. Además, se debe imprimir la densidad de cada planeta y si el planeta es un planeta exterior del sistema solar.
Ampliación:

•	Agregar dos atributos a la clase Planeta. El primero debe representar el periodo orbital del planeta (en años). El segundo atributo representa el periodo de rotación (en días).
•	Modificar el constructor de la clase para que inicialice los valores de estos dos nuevos atributos.
•	Modificar el método imprimir para que muestre en pantalla los valores de los nuevos atributos.
Requisitos:
•	La clase planeta deberá estar testeada. (Mínimo 70% de coverage)
•	El Readme deberá mostrar el diagrama de clases
Entregables:
•	Enlace al repositorio de Github
•	Captura de pantalla de la sección "Testing" de visual studio code donde se aprecia el coverage de los tests

anet	Number of Satellites	Mass (kg)	Volume (km³)	Diameter (km)	Mean Distance from Sun (million km)	Type of Planet	Observable with Naked Eye
Mercury	0	3.3011 × 10²³	6.083 × 10¹⁰	4,880	57.9	Terrestrial	Yes
Venus	0	4.8675 × 10²⁴	9.2843 × 10¹¹	12,104	108.2	Terrestrial	Yes
Earth	1	5.97237 × 10²⁴	1.08321 × 10¹²	12,742	149.6	Terrestrial	Yes
Mars	2	6.4171 × 10²³	1.6318 × 10¹¹	6,779	227.9	Terrestrial	Yes
Jupiter	79	1.8982 × 10²⁷	1.43128 × 10¹⁵	139,820	778.5	Gaseous	Yes
Saturn	83	5.6834 × 10²⁶	8.2713 × 10¹⁴	116,460	1,433.5	Gaseous	Yes
Uranus	27	8.6810 × 10²⁵	6.833 × 10¹³	50,724	2,872.5	Gaseous	No
Neptune	14	1.02413 × 10²⁶	6.254 × 10¹³	49,244	4,495.1	Gaseous	No


| Planet     | Number of Satellites | Mass (kg)             | Volume (km³)             | Diameter (km) | Mean Distance from Sun (million km) | Type of Planet | Observable with Naked Eye |
|------------|----------------------|-----------------------|--------------------------|---------------|--------------------------------------|----------------|---------------------------|
| Mercury    | 0                    | 3.3011 × 10²³         | 6.083 × 10¹⁰             | 4,880         | 57.9                                 | Terrestrial    | Yes                       |
| Venus      | 0                    | 4.8675 × 10²⁴         | 9.2843 × 10¹¹            | 12,104        | 108.2                                | Terrestrial    | Yes                       |
| Earth      | 1                    | 5.97237 × 10²⁴        | 1.08321 × 10¹²           | 12,742        | 149.6                                | Terrestrial    | Yes                       |
| Mars       | 2                    | 6.4171 × 10²³         | 1.6318 × 10¹¹            | 6,779         | 227.9                                | Terrestrial    | Yes                       |
| Jupiter    | 79                   | 1.8982 × 10²⁷         | 1.43128 × 10¹⁵           | 139,820       | 778.5                                | Gaseous        | Yes                       |
| Saturn     | 83                   | 5.6834 × 10²⁶         | 8.2713 × 10¹⁴            | 116,460       | 1,433.5                              | Gaseous        | Yes                       |
| Uranus     | 27                   | 8.6810 × 10²⁵         | 6.833 × 10¹³             | 50,724        | 2,872.5                              | Gaseous        | No                        |
| Neptune    | 14                   | 1.02413 × 10²⁶        | 6.254 × 10¹³             | 49,244        | 4,495.1                              | Gaseous        | No                        |

| Planet     | Satellites<br>(Number) | Mass<br>(kg)          | Volume<br>(km³)          | Diameter<br>(km) | Distance from<br>Sun (mln km) | Orbital<br>Period (years) | Rotation<br>Period (days) | Type of<br>Planet | Observable<br>with Naked Eye |
|------------|-------------------------|-----------------------|--------------------------|------------------|-------------------------------|---------------------------|---------------------------|-------------------|-----------------------------|
| Mercury    | 0                       | 3.3011 × 10²³         | 6.083 × 10¹⁰             | 4,880            | 57.9                          | 0.24                      | 58.6                      | Terrestrial       | Yes                         |
| Venus      | 0                       | 4.8675 × 10²⁴         | 9.2843 × 10¹¹            | 12,104           | 108.2                         | 0.62                      | -243                      | Terrestrial       | Yes                         |
| Earth      | 1                       | 5.97237 × 10²⁴        | 1.08321 × 10¹²           | 12,742           | 149.6                         | 1.00                      | 1.00                      | Terrestrial       | Yes                         |
| Mars       | 2                       | 6.4171 × 10²³         | 1.6318 × 10¹¹            | 6,779            | 227.9                         | 1.88                      | 1.03                      | Terrestrial       | Yes                         |
| Jupiter    | 79                      | 1.8982 × 10²⁷         | 1.43128 × 10¹⁵           | 139,820          | 778.5                         | 11.86                     | 0.41                      | Gaseous           | Yes                         |
| Saturn     | 83                      | 5.6834 × 10²⁶         | 8.2713 × 10¹⁴            | 116,460          | 1,433.5                       | 29.46                     | 0.45                      | Gaseous           | Yes                         |
| Uranus     | 27                      | 8.6810 × 10²⁵         | 6.833 × 10¹³             | 50,724           | 2,872.5                       | 84.01                     | -0.72                     | Gaseous           | No                          |
| Neptune    | 14                      | 1.02413 × 10²⁶        | 6.254 × 10¹³             | 49,244           | 4,495.1                       | 164.8                     | 0.67                      | Gaseous           | No                          |

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
