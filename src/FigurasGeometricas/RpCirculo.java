package FigurasGeometricas;

public class RpCirculo extends RpFigura {

    public RpCirculo(double valor1) {
        super(valor1);
    }

    @Override
    public double getArea() {
        return Math.PI * valor1 * valor1;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * valor1;
    }
}

