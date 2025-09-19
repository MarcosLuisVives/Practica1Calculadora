import java.util.Scanner;

public class Calculadora {
    int num1;
    int num2;
    String operacion;
    Scanner sc=new Scanner(System.in);
    public double operar( int num1,int num2, String  operarcion){
        double total=0;
        switch (operacion){
            case "+" -> total=num1+num2;
            case "-" -> total=num1-num2;
            case "*" -> total=num1*num2;
            case "/" -> total= (double) num1 /num2;
            default -> System.out.println("porfavor introduce un operador valido");
        }

        return total;
    }
    public void calculadora(){
        System.out.println("Bienvenido a la calculadora mas completa");
        System.out.println("Cual es el primer numero?");
        try {
            num1=sc.nextInt();
            System.out.println("Cual es el segundo numero?");
            num2=sc.nextInt();
        }catch (NumberFormatException e){
            System.out.println("Error: La cadena no es un número entero válido.");
        }


    }

}
