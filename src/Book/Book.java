package Book;

/**Outlays necessary information and methods for a book object
 * Created by Draga on 12/09/2016.
 */
public abstract class Book {
    String type;
    String title;
    double price;

    Book(String title, String type){
        this.type = type;
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String bookString = "Title: " + title + "\nType: " + type + "\nPrice: $" + price;
        return bookString;
    }

    public abstract void setPrice();
}
