package Book;

/**NonFiction class handles books of the non fiction category.
 * Created by Draga on 12/09/2016.
 */
public class NonFiction extends Book {

    NonFiction(String title, String type){
        super(title, type);
        setPrice();
    }

    NonFiction(String type){
        super("Unknown", type);
        setPrice();
    }

    @Override
    public void setPrice() {
        this.price = 37.99;
    }
}
