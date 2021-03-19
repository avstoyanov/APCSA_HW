public class NegativeInt {
    private static int row;
    private static int col;
    public static int[] findNeg(int[][] arr){
        int[] position = new int[2];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] < 0){
                    row = i;
                    col = j;
                    position[0] = row;
                    position[1] = col;
                    return position;
                }
            }
        }
        row = arr.length;
        col = arr[0].length;
        position[0] = row;
        position[1] = col;
        return position;
    }
}
