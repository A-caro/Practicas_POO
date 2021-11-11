package src.poo.polymorphims.subclass;

import src.poo.polymorphims.superclass.Vehicle;

import java.util.Objects;

public class Truck extends Vehicle {
    private Integer maxLoad;

    public Truck() {
    }

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(String brand, String model, Integer year, Integer maxLoad) {
        super(brand, model, year);
        this.maxLoad = maxLoad;
    }

    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String technicalSheet() {
        if (maxLoad >= 101) {
            return String.format("Marca:%s, Modelo:%s, Año:%d. Tienes que usar este auto en el campo, es una máquina de trabajo!!", getBrand(), getModel(), getYear());
        } else {
            return String.format("Marca:%s, Modelo:%s, Año:%d. Para iniciar un negocio de flete, está muy bien este auto.", getBrand(), getModel(), getYear());
        }
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Objects.equals(maxLoad, truck.maxLoad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxLoad);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxLoad=" + maxLoad +
                '}';
    }
}