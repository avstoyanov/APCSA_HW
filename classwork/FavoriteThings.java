import java.util.Scanner;

public class FavoriteThings {
    public static void main(String[] args){
        Scanner favorites = new Scanner(System.in);

        System.out.println("Enter you favorite things (separated by commas):");
        String favoriteThings = favorites.nextLine();
        String[] thingList;
        thingList = favoriteThings.split(", ");
        String commonIntrest;
        if (thingList.length > 1){
            commonIntrest = thingList[thingList.length - 2];
        } else{
            commonIntrest = thingList[0];
        }
        System.out.println("Nice! I also like " + commonIntrest);
        favorites.close();
    }
}
