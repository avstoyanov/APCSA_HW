/**
 * Created by Alexander Stoyanov on 10/22/20.
 * Program Description: tests the Book class
 */
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("input total number of pages:");
        int pages = scan.nextInt();
        scan.close();
        Book testBook = new Book(pages);
        testBook.nextPage();
        System.out.println(testBook.getCurrentPage());
        testBook.nextPage();
        System.out.println(testBook.getCurrentPage());
        testBook.nextPage();
        System.out.println(testBook.getCurrentPage());
    }
}
