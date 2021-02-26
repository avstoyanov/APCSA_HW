/**
 * Created by Alex on 11/19/20.
 * Program Description:
 */

public class PopulationMexico {
    private static int initYear = 2014;
    private static double initPop = 123.8;
    private static double growthRate = 0.005;

    public static int population_reached(double pop){
        int finYear = initYear;
        double projectedPop = initPop;
        while(projectedPop < pop){
            projectedPop *= 1 + growthRate;
            finYear++;
        }
        return finYear;
    }

    public static void main(String[] args){
        System.out.println(population_reached(200));
    }

}
