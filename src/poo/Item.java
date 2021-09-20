package src.poo;

import java.util.Date;

public class Item {
    //Atributos
    public String name;
    public Double price;
    public Double tax;
    public Date expirationDate;

    //Metodos
    public Double getTotalToPay(){
        return price + tax;
    }
    //Metodos
    public void calculeTax(){
        tax = price * 0.19;
    }
    //Metodos
    public boolean canItBeSold(){
        Date today = new Date();
        return expirationDate.after(today);

    }



}
