package src.poo.metodoconstructor.pasovariables;

public class App {
    public static void main(String[] args) {
        Result resultado = new Result();
        double a = 2.6;
        double b = 2.3;
        Arithmetic aritmetica = new Arithmetic();

        aritmetica.sum(resultado, a, b);
        System.out.println(resultado.getResultSum());
        aritmetica.subtraction(resultado, a, b);
        System.out.println(resultado.getResulSubstraction());
        aritmetica.multiplication(resultado,a,b);
        System.out.println(resultado.getMultiplication());
        aritmetica.division(resultado,a ,b);
        System.out.println(resultado.getDivision());




    }
}
