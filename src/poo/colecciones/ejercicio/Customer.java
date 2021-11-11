package src.poo.colecciones.ejercicio;

import java.util.Objects;

public class Customer {
    private int codigoDeRegistro;
    private String razonSocial;
    private String dirección;

    public Customer(int codigoDeRegistro, String razonSocial, String dirección){
        this.dirección = dirección;
        this.razonSocial = razonSocial;
        this.codigoDeRegistro = codigoDeRegistro;

    }

    public int getCodigoDeRegistro() {
        return codigoDeRegistro;
    }

    public void setCodigoDeRegistro(int codigoDeRegistro) {
        this.codigoDeRegistro = codigoDeRegistro;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "codigoDeRegistro='" + codigoDeRegistro + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", dirección='" + dirección + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(codigoDeRegistro, customer.codigoDeRegistro) && Objects.equals(razonSocial, customer.razonSocial) && Objects.equals(dirección, customer.dirección);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDeRegistro, razonSocial, dirección);
    }
}
