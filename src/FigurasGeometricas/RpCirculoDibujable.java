package FigurasGeometricas;

import java.awt.Graphics;

public class RpCirculoDibujable extends RpCirculo implements RpFiguraDibujable {
    private int x;
    private int y;

    public RpCirculoDibujable(double valor1, int x, int y) {
        super(valor1);
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
        int radio = (int) getValor1();
        g.drawOval(x - radio, y - radio, 2 * radio, 2 * radio);
    }
}

