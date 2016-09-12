package NewspaperSubscription;

/**Class handles online subscriptions to the newspaper
 * Created by Draga on 12/09/2016.
 */
public class OnlineNewspaperSubscription extends NewspaperSubscription {

    OnlineNewspaperSubscription(String name, String address){
        super(name);
        setAddress(address);
    }

    @Override
    void setAddress(String address) {
        boolean hasAtSymbol = false;
        for (int i = 0; i < address.length(); i++) {
            char currentChar = address.charAt(i);
            if (currentChar== '@'){
                hasAtSymbol = true;
            }
        }
        if (hasAtSymbol){
            this.address = address;
            rate = 9;
        }
        else{
            rate = 0;
            System.out.println("Invalid address.");
        }
    }
}
