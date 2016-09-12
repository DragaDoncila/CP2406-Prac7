package PhoneCall;

import javax.swing.*;

/**Demonstrates use of phone call classes
 * Created by Draga on 12/09/2016.
 */
public class DemoPhoneCalls {
    public static void main(String[] args) {
        PhoneCall myCall = new IncomingPhoneCall("3450869");
        PhoneCall yourCall = new OutgoingPhonecall("348810495", 25);

        System.out.println(myCall.getInformation());
        System.out.println();
        System.out.println(yourCall.getInformation());

        PhoneCall[] myCalls = new PhoneCall[5];
        for (int i = 0; i < myCalls.length; ++i){
            char userChoice = getUserChoice();
            if (userChoice == 'I'){
                myCalls[i] = new IncomingPhoneCall("90029502");
            }
            else{
                myCalls[i] = new OutgoingPhonecall("034923542334", 40);
            }
            System.out.println(myCalls[i].getInformation());
        }
    }

    private static char getUserChoice() {
        String userString = JOptionPane.showInputDialog("I for Incoming, O for Outgoing>>>").toUpperCase();
        return userString.charAt(0);
    }
}
