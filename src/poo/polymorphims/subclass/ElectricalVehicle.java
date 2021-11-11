package src.poo.polymorphims.subclass;

import src.poo.polymorphims.superclass.Vehicle;

import java.util.Objects;

public class ElectricalVehicle extends Vehicle {
    private Integer potency;

    public ElectricalVehicle(){}

    public ElectricalVehicle(Integer potency){
        this.potency = potency;
    }
    public ElectricalVehicle(String brand, String model, Integer year, Integer potency){
        super(brand, model, year);
        this.potency = potency;
    }

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }
    @Override
    public String technicalSheet(){
        if (year < 2007){
            return "No existe modelo para este año";
        }else{
            return String.format("Brand:%s, Model:%s, year:%d. Es un auto de última tecnología!", getBrand(), getModel(), getYear());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectricalVehicle that = (ElectricalVehicle) o;
        return Objects.equals(potency, that.potency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), potency);
    }

    @Override
    public String toString() {
        return "ElectricalVehicle{" +
                "potency=" + potency +
                '}';
    }
}
