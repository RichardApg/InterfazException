import FigurasGeometricas.RpCirculoDibujable;
import FigurasGeometricas.RpCuadradoDibujable;
import FigurasGeometricas.RpTrianguloDibujable;

import javax.swing.*;
import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radio = 0, lado = 0, base = 0, altura = 0;

        try {
            System.out.print("Ingrese el radio del círculo: ");
            radio = sc.nextDouble();

            System.out.print("Ingrese el lado del cuadrado: ");
            lado = sc.nextDouble();

            System.out.print("Ingrese la base del triángulo: ");
            base = sc.nextDouble();

            System.out.print("Ingrese la altura del triángulo: ");
            altura = sc.nextDouble();

            // Aquí se crean, si los valores son inválidos, se lanzará ArithmeticException desde la clase.
            RpCirculoDibujable circulo = new RpCirculoDibujable(radio, 100, 100);
            RpCuadradoDibujable cuadrado = new RpCuadradoDibujable(lado, 250, 100);
            RpTrianguloDibujable triangulo = new RpTrianguloDibujable(base, altura, 150, 250);

            System.out.println("\n=== Resultados ===");
            System.out.println("Círculo - Área: " + circulo.getArea() + " | Perímetro: " + circulo.getPerimetro());
            System.out.println("Cuadrado - Área: " + cuadrado.getArea() + " | Perímetro: " + cuadrado.getPerimetro());
            System.out.println("Triángulo - Área: " + triangulo.getArea() + " | Perímetro (equilátero): " + triangulo.getPerimetro());

            JFrame frame = new JFrame("Dibujar Figuras");
            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    circulo.dibujar2D(g);
                    cuadrado.dibujar2D(g);
                    triangulo.dibujar2D(g);
                }
            };

            panel.setPreferredSize(new Dimension(500, 500));
            frame.add(panel);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        } catch (InputMismatchException e) {
            System.err.println("Error: Debe ingresar un número válido.");
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}