package PhoneCall;

/**Handles phonecalls of the outgoing variety.
 * Created by Draga on 12/09/2016.
 */
public class OutgoingPhonecall extends PhoneCall {
    double minutes;

    OutgoingPhonecall(String phoneNum, double minutes){
        super(phoneNum);
        setPrice(0.04);
        this.minutes = minutes;

    }

    @Override
    String getPhoneNum() {
        return phoneNum;
    }

    @Override
    double getCallPrice() {
        return callPrice;
    }

    double getTotalPrice(){
        return (getCallPrice() * minutes);
    }

    @Override
    String getInformation() {
        String infoString = "Phone Number: " + getPhoneNum() +
                "\nRate per Minute: $" + getCallPrice() +
                "\nMinutes: " + minutes +
                "\nPrice of Call: $" + getTotalPrice();
        return infoString;
    }
}
