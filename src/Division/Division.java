package Division;

/**Handles a division of a company with information thereof
 * Created by Draga on 12/09/2016.
 */
public abstract class Division {
    String divName;
    int accountNum;

    Division(String name, int accNum){
        divName = name;
        accountNum = accNum;
    }

    abstract String display();
}
