import java.lang.reflect.Array;
import java.util.*;
/**
 * Created by Alex on 3/19/21.
 * Program Description:
 */

public class LineList {
    private ArrayList<String> list;
    public LineList(){
        list = new ArrayList<String>();
    }

    public int size(){
        return list.size();
    }

    public String get(int k){
        return list.get(k);
    }

    public void add(String line){
        list.add(line);
    }

    public String remove(int k){
        return list.remove(k);
    }

    public void move(int index, int newIndex){
        list.add(newIndex, list.remove(index));
    }

    public void shuffle(){
        for(int n = list.size()-1; n>=2; n--){
            move((int)(Math.random()*(n+1)), n);
        }
    }
}
