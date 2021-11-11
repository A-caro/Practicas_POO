package src.poo.polymorphims.subclass;

import src.poo.polymorphims.superclass.Vehicle;

import java.util.Objects;

public class SportsVehicle extends Vehicle {
    private Integer rpm;

    public SportsVehicle(){}

    public SportsVehicle(Integer rpm){
        this.rpm = rpm;
    }
    public SportsVehicle(String brand, String model, Integer year, Integer rpm){
        super(brand, model, year);
        this.rpm = rpm;

    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    @Override
    public String technicalSheet(){
        if(rpm > 601) {
            return String.format("brand: %s model: %s year:%d, Eres parte del elenco de rapidos y furiosos?", getBrand(), getModel(), getYear());
        }if (rpm >= 301){
            return String.format("Marca:%s, Modelo:%s, Año:%d. Si tienes este auto, debes considerar participar en NASCAR.", getBrand(), getModel(), getYear());
        } if(rpm >= 51){
            return String.format("brand: %s model: %s year:%d","Con este auto puedes desafiar a cualquiera", getBrand(), getModel(),getYear());
        }else{
            return String.format("Marca:%s, Modelo:%s, Año:%d. El auto es muy bonito pero solo sirve para salir a pasear.", getBrand(), getModel(), getYear());
        }
    }

    @Override
    public String toString() {
        return "SportsVehicle{" +
                "rpm=" + rpm +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportsVehicle that = (SportsVehicle) o;
        return Objects.equals(rpm, that.rpm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rpm);
    }
}
