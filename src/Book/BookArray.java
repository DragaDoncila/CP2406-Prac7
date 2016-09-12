package Book;

import javax.swing.*;

/**Application holds 10 books and displays details thereof
 * Created by Draga on 12/09/2016.
 */
public class BookArray {
    public static void main(String[] args) {
        Book[] myBooks = new Book[10];
        for (int i = 0; i < myBooks.length; ++i){
            char userChoice = getUserChoice();
            if (userChoice == 'F'){
                myBooks[i] = new Fiction("fiction");
            }
            else {
                myBooks[i] = new NonFiction("nonfiction");
            }
            System.out.println(myBooks[i].toString());
        }
    }

    public static char getUserChoice() {
        String userString = JOptionPane.showInputDialog("F for Fiction, N for Nonfiction>>>").toUpperCase();
        return userString.charAt(0);
    }
}
