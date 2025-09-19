public class Calculadora {
    int num1;
    int num2;
    String operacion;

    public double operar( int num1,int num2, String  operarcion){
        double total=0;
        switch (operacion){
            case "+" -> total=num1+num2;
            case "-" -> total=num1-num2;
            case "*" -> total=num1*num2;
            case "/" -> total= (double) num1 /num2;

        }


        return total;
    }

}
