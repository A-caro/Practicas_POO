package src.poo.metodoconstructor.pasovariables;

public class Arithmetic {


    public void sum(Result resultado, double a, double b){ //
     resultado.setResultSum(a+b);
    }

    public void subtraction(Result resultado, double a, double b) {
        resultado.setResulSubstraction(a - b);
    }

    public void multiplication(Result resultado, double a, double b){
    resultado.setMultiplication(a * b);
    }

    public void division(Result resultado, double a, double b){
       resultado.setDivision(a / b);
    }
}
