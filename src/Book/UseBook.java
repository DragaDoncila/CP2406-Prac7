package Book;

/**Class demonstrates the use of Fiction and NonFiction books, descended
 * from the abstract class, Book.
 * Created by Draga on 12/09/2016.
 */
public class UseBook {
    public static void main(String[] args) {
        Book myFiction = new Fiction("A Story that is Not Factually Based", "fiction");
        Book nonFiction = new NonFiction("A Story Based on Facts Which are True", "nonfiction");

        System.out.println(myFiction);
        System.out.println(nonFiction);
    }
}
