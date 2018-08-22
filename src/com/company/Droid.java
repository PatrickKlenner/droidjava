/*calculates the amount of the current battery level and ask the user how long the droid should recharge. */

import java.util.Scanner;
//test
public class Droid{
    double batteryLevel;

    public static void main(String[] args){ /*string liste wird von cmd übernommen
                                           mit args kann man schon input
                                           argumente wie "meter" oder "hour" festlegen */

       // for(int i = 0; i < args.length; i++) { --- versuch args arrray elemente zu ändern
            Droid myDroid = new Droid();
            myDroid.activate();
            myDroid.chargeBattery(0);
            System.out.println("");
            myDroid.hover(5);
            myDroid.chargeBattery(0);
    }

    Droid() {
        batteryLevel = 100;
    }
    public void activate() {
        System.out.println("Activated");
        batteryLevel = batteryLevel - 5;
        System.out.println("Battery level is : " + batteryLevel + " %.");

    }

    public void chargeBattery(int hours) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter charging hours: ");
        hours = input.nextInt();  // getting an integer

        System.out.println("Droid charging ...");
        if(hours<0){
            System.out.println("Error: No usable value for hours.");
            
        }
        else {
            batteryLevel = batteryLevel + 2 * hours;

            if (batteryLevel > 100) {
                batteryLevel = 100;
                System.out.println("Battery Level is: " + batteryLevel + " %.");
            } else if (batteryLevel <= 0) {
                batteryLevel = 0;
                System.out.println("Battery Level is: " + batteryLevel + " %.");
            } else {
                System.out.println("Battery Level is: " + batteryLevel + " %.");
            }
        }

    }
    public double checkBatteryLevel(){
        System.out.println("Battery Level is: " + batteryLevel + " %.");
        return batteryLevel;
    }

    public void hover(int meter){
        if ( meter > 5){
            System.out.println("Error I can't hover above 5 meter");
        }
        else {
            double j = Math.pow(meter,2) ;
            System.out.println("Hovering ...");
            batteryLevel = batteryLevel - (2+j);
            if (batteryLevel <=0){
                batteryLevel = 0;
                System.out.println("Battery Level is: " + batteryLevel + " %.");
            }
            else {
                System.out.println("Battery Level is: " + batteryLevel + " %.");
            }
        }
    }


}