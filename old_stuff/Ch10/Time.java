/**
 * Created by Alex on 2/26/21.
 * Program Description:
 */

public class Time {
    private int hours;
    private int minutes;

    public Time(int h, int m) throws IllegalArgumentException {
        if(h > 24 || m > 60 || h < 0 || m < 0){
            throw new IllegalArgumentException();
        }
        hours = h;
        minutes = m;
    }

    private int toMins(){
        return hours*60+minutes;
    }

    public boolean lessThan(Time t){
        return this.toMins() < t.toMins();
    }

    public int elapsedSince(Time t){
        int then = t.toMins();
        int now = this.toMins();
        int diff;
        if(then > now){
            return 24*60-then + now;
        }
        return now-then;
    }

    public String toString(){
        String out = hours + ":" + minutes;
        System.out.println(out);
        return out;
    }

}
