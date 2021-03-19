import java.awt.*;

public class StalkerEnemy extends Enemy {
    private final Rectangle playerRect;

    public StalkerEnemy(int x, int y, int w, int h, Rectangle p) {
        super(x, y, w, h);
        playerRect = p;
    }

    public Color getColor() {
        return Color.MAGENTA;
    }

    public void move() {
        Rectangle ourRect = super.getRectangle();
        if (ourRect.x < playerRect.x) {
            ourRect.x += 1;
        } else {
            ourRect.x -= 1;
        }
        if (ourRect.y < playerRect.y) {
            ourRect.y += 1;
        } else {
            ourRect.y -= 1;
        }

    }

}