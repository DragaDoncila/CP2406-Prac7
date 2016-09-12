package Division;

/**Class handles divisions of the company from overseas
 * Created by Draga on 12/09/2016.
 */
public class InternationalDivision extends Division {
    String country;
    String language;

    InternationalDivision(String name, int accNum, String country, String lang){
        super(name, accNum);
        this.country = country;
        this.language = lang;
    }

    @Override
    String display() {
        String infoString = "Name: " + this.divName +
                "\nAccount Number: " + accountNum +
                "\nCountry: " + country +
                "\nLanguage: " + language;
        return infoString;
    }
}
