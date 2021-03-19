import org.w3c.dom.css.Rect;

/**
 * Created by Alex on 2/26/21.
 * Program Description:
 */

public class Rectangle {
    private int width = -1;
    private int height = -1;
    public Rectangle(int w, int h){
        if(w>0 && h>0) {
            width = w;
            height = h;
        }
        System.out.println("bad");
    }

    public Rectangle(int len){
        if(len>0) {
            width = len;
            height = len;
        }
        System.out.println("bad");
    }

    public Rectangle(){
        width = 1;
        height = 1;
    }

    public boolean isSquare(){
        if(width == height && width > 0){
            System.out.println("yep");
            return true;
        }
        System.out.println("nope");
        return false;
    }

    public void quadrize(){
        int len;
        int area = width * height;
        double point = Math.sqrt(area);
        int below = (int)(Math.floor(point)*Math.floor(point));
        int above = (int)(Math.ceil(point)*Math.ceil(point));
        if(area >= (below+above)/2.0){
            len = (int)Math.ceil(point);
        } else{
            len = (int)point;
        }
        width = len;
        height = len;
        System.out.println("now square with side "+ len);
    }

}
