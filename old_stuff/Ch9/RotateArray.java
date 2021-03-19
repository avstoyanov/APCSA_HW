public class RotateArray {
    public static void rotate(int[] a, int d){
        int[] fin = new int[a.length];
        d %= a.length;
        for(int e = 0; e < a.length; e++){
            fin[((e+a.length)+d)%a.length] = a[e];
        }
        for(int j = 0; j < a.length; j++){
            a[j] = fin[j];
        }
    }

    public static void main(String[] args) {
        int[] dum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        rotate(dum, 132);
        for(int i: dum){
            System.out.print(i + " ");
        }
    }
}
