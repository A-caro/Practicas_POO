package src.poo.herencia.aereo;

public class Airplane {
    private String motorType;
    private String model;

    public Airplane(){}

    public Airplane(String motorType, String model){
        this.motorType = motorType;
        this.model = model;

    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
