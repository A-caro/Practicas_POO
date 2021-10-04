package src.poo.herencia.transporte;

public class Auto extends Transporte {
    private String patent;
    private String brand;

    public Auto(){
        this.seats = 5;
    }

    public Auto(String patent, String brand) {
        this.patent = patent;
        this.brand = brand;
    }
    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
