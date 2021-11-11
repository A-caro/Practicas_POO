package src.poo.polymorphims;

import src.poo.polymorphims.subclass.ElectricalVehicle;
import src.poo.polymorphims.subclass.SportsVehicle;
import src.poo.polymorphims.subclass.Truck;
import src.poo.polymorphims.superclass.Vehicle;

public class App {
    public static void main(String[] args) {
        String fichaTecnicaArray[] = new String[12];
        Vehicle uno = new Vehicle("ford", "ka", 2011);
        Vehicle dos = new Vehicle("Volskwagen", "gol", 2005);
        Vehicle tres = new Vehicle("Chevrolet", "corsa", 2020);

        Vehicle cuatro = new ElectricalVehicle("Renault", "Kangoo z.e", 2007, 50);
        Vehicle cinco = new ElectricalVehicle("Nissan", "Leaf", 2020, 149);
        Vehicle seis = new ElectricalVehicle("Porsche", "Taycan", 2020, 530);

        Vehicle siete= new SportsVehicle("Toyota", "Supra", 2020, 601);
        Vehicle ocho = new SportsVehicle("Aston Martin", "D811", 2020, 305);
        Vehicle nueve = new SportsVehicle("Lamborghini", "Huracan Evo", 2020, 45);

        Vehicle diez = new Truck("Ram", "Rebel", 2020, 120 );
        Vehicle once = new Truck("Chevrolet", "Silverado 1500", 2020, 70);
        Vehicle doce = new Truck("Toyota", "Hilux", 2020, 100);


        fichaTecnicaArray[0] = uno.technicalSheet();
        fichaTecnicaArray[1] = dos.technicalSheet();
        fichaTecnicaArray[2] = tres.technicalSheet();
        fichaTecnicaArray[3] = cuatro.technicalSheet();
        fichaTecnicaArray[4] = cinco.technicalSheet();
        fichaTecnicaArray[5] = seis.technicalSheet();
        fichaTecnicaArray[6] = siete.technicalSheet();
        fichaTecnicaArray[7] = ocho.technicalSheet();
        fichaTecnicaArray[8] = nueve.technicalSheet();
        fichaTecnicaArray[9] = diez.technicalSheet();
        fichaTecnicaArray[10] = once.technicalSheet();
        fichaTecnicaArray[11] = doce.technicalSheet();



        for (int i = 0; i < 12; i++) {
            System.out.println("La ficha tecnica del vehiculo es " + fichaTecnicaArray[i]);

        }






    }
}
