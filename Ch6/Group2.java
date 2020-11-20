
public class Group2 {
    public static double getOrderTotal(int bp, int nb){
        double pbp = 20.95;
        double pnb = 21.95;
        int totBooks = bp+nb;
        if(bp*nb == 0){
            return pbp*bp + pnb*nb;
        } else if (bp*nb == 1){
            return 39.95;
        } else if(totBooks <12){
            return 16.95*(totBooks);
        } else{
            return 16.00*(totBooks);
        }
    }

    public static int findBestFit (int size1, int size2, int space){
        return ((space / size1) > 0 ? 1 : 0) + ((space / size2) > 0 ? 1 : 0) + ((space / (size1 + size2)) > 0 ? 1 : 0);
    }



    public static void main(String[] args) {
        //System.out.println(getOrderTotal(5, 0));
        System.out.println(findBestFit(1, 2, 0));
    }
}
