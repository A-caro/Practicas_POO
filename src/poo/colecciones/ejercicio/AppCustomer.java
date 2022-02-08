package src.poo.colecciones.ejercicio;
import com.sun.prism.PixelFormat;

import java.util.HashMap;

public class AppCustomer {
    public static void main(String[] args) {
        Customer cliente1 = new Customer("456321","Tienda", "Las heras 1000");
        Customer cliente2 = new Customer("498746","Tienda", "Juarez 3143");
        Customer cliente3 = new Customer("450021","Tienda", "Callao 100");
        Customer cliente4 = new Customer("429721","Tienda", "Calle falsa 123");
        Customer cliente5 = new Customer("321121","Tienda", "Tulipanes 500");

        HashMap<Integer, Customer> customers = new HashMap();
        //parseInt es un metodo q se usa para pasar un String a un entero
        customers.put(Integer.parseInt(cliente1.getCodigoDeRegistro()), cliente1);
        customers.put(Integer.parseInt(cliente2.getCodigoDeRegistro()),cliente2);
        customers.put(Integer.parseInt(cliente3.getCodigoDeRegistro()),cliente3);
        customers.put(Integer.parseInt(cliente4.getCodigoDeRegistro()),cliente4);
        customers.put(Integer.parseInt(cliente5.getCodigoDeRegistro()),cliente5);


        //usamos el for each para recorrer el hashMap e imprimir en pantalla
        // .values son los valores q va a obtener del array
        for (Customer clientes : customers.values()) {
            System.out.println(customers);

        }
        Customer customer = getCustomerByKey(customers, Integer.parseInt(cliente5.getCodigoDeRegistro()));
        System.out.println("Cliente encontrado: " + customer);
    }


    public static Customer getCustomerByKey(HashMap<Integer, Customer> customers, Integer key){
        Customer customer = customers.get(key);
        /*for (Customer cliente : customers.values()) {
            if (Integer.parseInt(cliente.getCodigoDeRegistro()) == key) {
                return cliente;
            }
        }*/
        return customer;

    }



}
