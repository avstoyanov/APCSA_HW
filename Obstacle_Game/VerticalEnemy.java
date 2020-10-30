import java.awt.*;

public class VerticalEnemy extends Enemy{
    private int screenHeight, ySpeed;
    public VerticalEnemy(int x, int y, int w, int h, int sH, int yS) {
        super(x, y, w, h);
        screenHeight = sH;
        ySpeed = yS;
    }

    public Color getColor() {
        return Color.RED;
    }

    public void move() {
        Rectangle rect = getRectangle();

        if(rect.y <= 0 || (rect.y + rect.height) >= screenHeight){
            ySpeed = -ySpeed;
        }
        rect.y += ySpeed;
    }

}