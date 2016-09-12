package Division;

/**Class handles local divisions of the company
 * Created by Draga on 12/09/2016.
 */
public class DomesticDivision extends Division{

    String state;

    DomesticDivision(String name, int accNum, String state){
        super(name, accNum);
        this.state = state;
    }

    @Override
    String display() {
        String infoString = "Name: " + this.divName +
                "\nAccount Number: " + accountNum +
                "\nState: " + state;
        return infoString;
    }
}
