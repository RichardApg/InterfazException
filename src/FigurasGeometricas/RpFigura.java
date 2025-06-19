package FigurasGeometricas;

public class RpFigura {
    protected double valor1;

    public RpFigura(double valor1) {
        if (valor1 <= 0) {
            throw new ArithmeticException("El valor debe ser positivo.");
        }
        this.valor1 = valor1;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        if (valor1 <= 0) {
            throw new ArithmeticException("El valor debe ser positivo.");
        }
        this.valor1 = valor1;
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimetro() {
        return 0.0;
    }
}

