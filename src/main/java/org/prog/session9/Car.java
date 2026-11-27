package org.prog.session9;

import java.util.Objects;

public class Car {

    public String color;
    public String model;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            return Objects.equals(color, ((Car) obj).color)
                    && Objects.equals(model, ((Car) obj).model);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model);
    }
}
