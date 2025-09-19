import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora {
    int num1;
    int num2;
    String operacion;
    Scanner sc = new Scanner(System.in);

    public double operar(int num1, int num2) {
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
                total = (double) num1 / num2;
            }
            default -> System.out.println("Por favor, introduce un operador válido (+, -, *, /).");
        }
        return total;
    }

    public void calculadora() {
        System.out.println("Bienvenido a la calculadora más completa");

        try {
            System.out.print("¿Cuál es el primer número? ");
            num1 = sc.nextInt();

            System.out.print("¿Cuál es el segundo número? ");
            num2 = sc.nextInt();

            System.out.print("Introduce la operación (+, -, *, /): ");
            operacion = sc.next();

            double resultado = operar(num1, num2);
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