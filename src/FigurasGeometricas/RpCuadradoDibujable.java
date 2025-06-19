package FigurasGeometricas;

import java.awt.Graphics;

public class RpCuadradoDibujable extends RpCuadrado implements RpFiguraDibujable {
    private int x;
    private int y;

    public RpCuadradoDibujable(double lado, int x, int y) {
        super(lado);
        this.x = x;
        this.y = y;
    }

    @Override
    public void setCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void dibujar2D(Graphics g) {
        int lado = (int) getValor1();
        g.drawRect(x, y, lado, lado);
    }
}