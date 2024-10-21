// Estudiante: Juan David Jimenez Jimenez

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Figura> figuras = new ArrayList<>();
        int opcion;

        do {
            System.out.println("Seleccione una figura para calcular el área y perímetro:");
            System.out.println("1. Rectángulo");
            System.out.println("2. Triángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    Rectangulo rectangulo = new Rectangulo();
                    System.out.println("Ingrese la base del rectángulo:");
                    rectangulo.setBase(teclado.nextDouble());
                    System.out.println("Ingrese la altura del rectángulo:");
                    rectangulo.setAltura(teclado.nextDouble());

                    figuras.add(rectangulo);

                    System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                    System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
                    break;

                case 2:
                    Triangulo triangulo = new Triangulo();
                    System.out.println("Ingrese la base del triángulo:");
                    triangulo.setBase(teclado.nextDouble());
                    System.out.println("Ingrese la altura del triángulo:");
                    triangulo.setAltura(teclado.nextDouble());
                    System.out.println("Ingrese el lado 1 del triángulo:");
                    triangulo.setLado1(teclado.nextDouble());
                    System.out.println("Ingrese el lado 2 del triángulo:");
                    triangulo.setLado2(teclado.nextDouble());
                    System.out.println("Ingrese el lado 3 del triángulo:");
                    triangulo.setLado3(teclado.nextDouble());

                    figuras.add(triangulo);

                    System.out.println("Área del triángulo: " + triangulo.calcularArea());
                    System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
                    break;

                case 3:
                    Circulo circulo = new Circulo();
                    System.out.println("Ingrese el radio del círculo:");
                    circulo.setRadio(teclado.nextDouble());

                    figuras.add(circulo);

                    System.out.println("Área del círculo: " + circulo.calcularArea());
                    System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while (opcion != 4);

    }
}