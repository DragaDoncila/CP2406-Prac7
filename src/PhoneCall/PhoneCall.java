package PhoneCall;

/**Stores information about the length and charge rates of a phone call
 * through Talk-A-Lot Cell Phone Company.
 * Created by Draga on 12/09/2016.
 */
public abstract class PhoneCall {
    String phoneNum;
    double callPrice;

    PhoneCall(String phoneNum){
        this.phoneNum = phoneNum;
        setPrice(0.0);
    }

    protected void setPrice(double price) {
        this.callPrice = price;
    }

    abstract String getPhoneNum();
    abstract double getCallPrice();
    abstract String getInformation();
}
