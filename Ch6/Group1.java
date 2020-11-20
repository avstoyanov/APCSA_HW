
public class Group1 {
    public static double totalWages(double hours, double rate){
        double wages;
        wages = rate*hours + ((hours > 40) ? rate*0.5*(hours-40) : 0);
        return wages;
    }

    public static boolean isLeapYear(int year){
        if(((year/100)%4 + year%4) == 0){
            return true;
        } else{
            return false;
        } //And this is how to use unnecessary if/else statements
    }

    public static void main(String[] args) {
        //System.out.println(totalWages(45, 12.50));
        //System.out.println(isLeapYear(2400));
    }
}
