package cat.barcelonactiva.itacademy.Ex1_3_Command.models;

import java.util.Objects;

public abstract class Vehicle {

    protected String id;

    public Vehicle(String id) {
        this.id = id;
    }

    public void turnOn(){
        System.out.println("The " + this + " has been turned on.");
    }

    public void speedUp() {
        System.out.println("The " + this + " is speeding up.");
    }

    public void slowDown() {
        System.out.println("The " + this + " is slowing down.");
    }

    /**
     * Equality by id value
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(id, vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * toString prints the subclass name and the id
     * @return
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "-" + id;
    }
}
