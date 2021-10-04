package src.poo.herencia.transporte;

public class Transporte {
    protected Integer seats;

    public Transporte(){}

    public Transporte(Integer seats){
        this.seats = seats;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}
