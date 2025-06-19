package FigurasGeometricas;

import java.awt.Graphics;
import java.awt.Polygon;

public class RpTrianguloDibujable extends RpTriangulo implements RpFiguraDibujable {
    private int x;
    private int y;

    public RpTrianguloDibujable(double base, double altura, int x, int y) {
        super(base, altura);
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
        int base = (int) getValor1();
        int altura = (int) getAltura();

        int[] xPoints = { x, x + base / 2, x - base / 2 };
        int[] yPoints = { y, y + altura, y + altura };

        Polygon p = new Polygon(xPoints, yPoints, 3);
        g.drawPolygon(p);
    }
}
