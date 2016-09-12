package NewspaperSubscription;

/**Handles newspaper subscriptions for users
 * Created by Draga on 12/09/2016.
 */
public abstract class NewspaperSubscription {
    String name;
    String address;
    double rate;

    NewspaperSubscription(String name){
        this.name = name;

    }

    public String getAddress() {
        return address;
    }

    public double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String infoString = "Name: " + name +
                "\nAddress: " + address +
                "\nRate: " + rate;
        return infoString;
    }

    abstract void setAddress(String address);
}
