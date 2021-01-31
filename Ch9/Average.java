public class Average {
    public static double average(int[] scores){
        int sum = 0;
        for(int s: scores){
            sum += s;
        }
        return sum / (double)scores.length;
    }
    public static void main(String[] args) {
        int[] vals = {1, 6, 9, 5, 3, 4, 2, 2, 2, 9, 3};
        System.out.println(average(vals));
    }
}
