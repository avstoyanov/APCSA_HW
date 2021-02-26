/**
 * Created by Alex on 11/19/20.
 * Program Description:
 */

public class Kevin {
    private static int neededAmount = 95;
    public static int[] certificationStudy(int needed){
        int totMaterial = 100;
        int months = 0;
        double learnedMaterial = 0;
        while (learnedMaterial < needed){
            learnedMaterial += 0.1*(totMaterial-learnedMaterial);
            months++;
        }

        int[] timeTaken = {months/12, months%12};
        return timeTaken;
    }

    public static void main(String[] args) {
        System.out.println(certificationStudy(neededAmount)[0] + " years, and " + certificationStudy(neededAmount)[1] + " months needed.");
    }
}
