package src.poo.metodos;

public class Saludador {
    public String saludar(String nombre, boolean tipoSaludo){
       if(tipoSaludo){
           String saludar = "Hola " + nombre;
           return saludar;
       }else{
           String despedirse = "Chao " + nombre;
           return despedirse;
       }
    }
}

/*

 */
