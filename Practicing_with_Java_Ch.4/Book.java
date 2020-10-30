/**
 * Created by Alexander Stoyanov on 10/22/20.
 * Program Description: creates a book class
 */

public class Book {
    private int numPages, currentPage;

    public Book(int pages){
        numPages = pages;
        currentPage = 1;
    }

    public int getNumPages(){
        return numPages;
    }

    public int getCurrentPage(){
        return currentPage;
    }

    public void nextPage(){
        if(currentPage < numPages){
            currentPage ++;
        }
    }
}
