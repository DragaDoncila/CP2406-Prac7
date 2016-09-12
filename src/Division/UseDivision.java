package Division;

/**Class demonstrates use of both division type objects
 * Created by Draga on 12/09/2016.
 */
public class UseDivision {
    public static void main(String[] args) {
        Division accounting = new DomesticDivision("Accounting", 2354, "Illinois");
        Division manufacturing = new InternationalDivision("Manufacturing", 34591, "China", "Mandarin");

        System.out.println(accounting.display());
        System.out.println();
        System.out.println(manufacturing.display());
    }
}
