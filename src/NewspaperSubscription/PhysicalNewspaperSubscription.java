package NewspaperSubscription;

/**Handles subscriptions at physical addresses
 * Created by Draga on 12/09/2016.
 */
public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    PhysicalNewspaperSubscription(String name, String address){
        super(name);
        setAddress(address);
    }

    @Override
    void setAddress(String address) {
        boolean hasDigit = false;
        for (int i = 0; i < address.length(); i++) {
            char currentChar = address.charAt(i);
            if (Character.isDigit(currentChar)){
                hasDigit = true;
            }
        }
        if (hasDigit){
            this.address = address;
            rate = 15;
        }
        else{
            rate = 0;
            System.out.println("Invalid address.");
        }

    }
}
