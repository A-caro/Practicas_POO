package src.poo.abstracto;

import java.util.Objects;

public class Circulo extends Figuras {
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }


    @Override
    public double calculoArea() {
        return Math.PI * Math.pow(radio,2);
        //Math.pow calculo radio al cuadrado
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return Double.compare(circulo.radio, radio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radio);
    }
}
