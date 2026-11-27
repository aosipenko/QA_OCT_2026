package org.prog.session9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//TODO: Make a data structure that will:
//      - Attach unique contacts to individual phones (create contact object OR make it Map)
//      - Add method that will return phone number of a contact by its name
//      - Add method that will return contact name by its number
//      example: Contact "Bob" has phone "123456789"
//      method 1: accepts "Bob" returns "123456789"
//      method 2: accepts "123456789" returns "Bob"

public class MoreCollections {

    public static void main(String[] args) {
        Car commonCar = new Car("Yellow", "Jeep");
        Map<String, Set<Car>> ownedCars = new HashMap<>();
        ownedCars.put("John", new HashSet<>());
        ownedCars.get("John").add(new Car("Red", "Cadillac"));
        ownedCars.get("John").add(new Car("Green", "Cadillac"));
        ownedCars.get("John").add(new Car("Blue", "Cadillac"));
        ownedCars.get("John").add(commonCar);

        ownedCars.put("Jane", new HashSet<>());
        ownedCars.get("Jane").add(new Car("Blue", "Ford"));
        ownedCars.get("Jane").add(commonCar);
        System.out.println(ownedCars);
        commonCar.color = "Black";
        System.out.println(ownedCars);
    }
}
