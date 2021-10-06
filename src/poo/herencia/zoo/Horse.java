package src.poo.herencia.zoo;

import java.util.Objects;

public class Horse extends Animal{
    private String name;
    private Integer power;

    public Horse(){}

    public Horse(String breed, String name, Integer power){
        super(breed);
        this.name = name;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(name, horse.name) && Objects.equals(power, horse.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, power);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
