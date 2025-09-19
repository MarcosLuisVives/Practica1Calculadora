import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora {
    double num1;
    double num2;
    Scanner sc = new Scanner(System.in);

    public double operar(double num1, double num2,String operacion) {
        double total = 0;
        switch (operacion) {
            case "+" -> total = num1 + num2;
            case "-" -> total = num1 - num2;
            case "*" -> total = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir por cero.");
                    return 0;
                }
                total = num1 / num2;
            }
            default -> System.out.println("Por favor, introduce un operador válido (+, -, *, /).");
        }
        return total;
    }

    public void calculadora() {
        System.out.println("Bienvenido a la calculadora más completa");

        try {
            System.out.print("¿Cuál es el primer número? ");
            String numero1=sc.next();
            num1=Double.parseDouble(numero1);

            System.out.print("¿Cuál es el segundo número? ");
            String numero2=sc.next();
            num2=Double.parseDouble(numero2);

            System.out.print("Introduce la operación (+, -, *, /): ");
            String operacion = sc.next();

            double resultado = operar(num1, num2,operacion);
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida. Debes introducir números enteros.");
        }
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        c.calculadora();
    }
}