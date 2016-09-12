package PhoneCall;

/**Class handles phonecalls of an incoming nature
 * Created by Draga on 12/09/2016.
 */
public class IncomingPhoneCall extends PhoneCall {

    IncomingPhoneCall(String phoneNum){
        super(phoneNum);
        setPrice(0.02);
    }

    @Override
    String getPhoneNum() {
        return phoneNum;
    }

    @Override
    double getCallPrice() {
        return callPrice;
    }

    @Override
    String getInformation() {
        String infoString = "Phone Number: " + getPhoneNum() +
                "\nRate per Minute: $" + getCallPrice() +
                "\nPrice of Call: $" + getCallPrice();
        return infoString;
    }
}
