package src.poo.abstracto;

import java.util.Objects;

public  class Triangulo extends Figuras {
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
   public double calculoArea() {
        return base * altura / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangulo triangulo = (Triangulo) o;
        return Double.compare(triangulo.base, base) == 0 && Double.compare(triangulo.altura, altura) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, altura);
    }
}
