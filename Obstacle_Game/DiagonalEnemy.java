import java.awt.*;

public class DiagonalEnemy extends VerticalEnemy{
    private int screenWidth, xSpeed;

    public DiagonalEnemy(int x, int y, int w, int h, int sH, int yS, int sW, int xS) {
        super(x, y, w, h, sH, yS);
        screenWidth = sW;
        xSpeed = xS;
    }

    public Color getColor() {
        return Color.PINK;
    }

    public void move() {
        Rectangle rect = getRectangle();
        super.move();
        if(rect.x < 0 || (rect.x + rect.width) > screenWidth){
            xSpeed = -xSpeed;
        }
        rect.x += xSpeed;
    }

}