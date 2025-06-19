package FigurasGeometricas;

public class RpTriangulo extends RpFigura {
    private double altura;

    public RpTriangulo(double base, double altura) {
        super(base);
        if (altura <= 0) {
            throw new ArithmeticException("La altura debe ser positiva.");
        }
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new ArithmeticException("La altura debe ser positiva.");
        }
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (valor1 * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        // Aproximación: equilátero basado en base
        return 3 * valor1;
    }
}