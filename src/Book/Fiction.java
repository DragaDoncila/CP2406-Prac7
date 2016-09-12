package Book;

/**Fiction class handles Book objects of type Fiction with a set price
 * Created by Draga on 12/09/2016.
 */
public class Fiction extends Book {

    Fiction(String title, String type){
        super(title, type);
        setPrice();
    }

    Fiction(String type){
        super("Unknown", type);
        setPrice();
    }

    @Override
    public void setPrice() {
        this.price = 24.99;
    }
}
