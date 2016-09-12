package NewspaperSubscription;

/**Class demonstrates creation of newspaper objects of various type
 * Created by Draga on 12/09/2016.
 */
public class DemoSubscription {
    public static void main(String[] args) {
        NewspaperSubscription myNews = new PhysicalNewspaperSubscription("Draga", "Blue");
        System.out.println(myNews);
        System.out.println();
        NewspaperSubscription yourNews = new OnlineNewspaperSubscription("James", "noemail");
        System.out.println(yourNews);

        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");

        NewspaperSubscription newNews = new PhysicalNewspaperSubscription("Draga", "25 New Street");
        System.out.println(newNews);
        System.out.println();
        NewspaperSubscription yourNewNews = new OnlineNewspaperSubscription("Draga", "@news");
        System.out.println(yourNewNews);

    }
}
