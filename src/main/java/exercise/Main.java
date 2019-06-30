package exercise;

import auxClasses.CalculateTruncatedNumber;
import auxClasses.ReadNumberFromUser;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        String number;
        if(args.length == 0){
            number = ReadNumberFromUser.getNumber();
        }else{
            number = args[0];
        }
        System.out.println("\t\tInput: " + number);
        double convertedNumber = convertStringToDouble(number);
        CalculateTruncatedNumber calc = new CalculateTruncatedNumber();
        String truncatedNumber = calc.getTruncatedNumber(convertedNumber);
        System.out.println("\t\tOutput: " + truncatedNumber);
    }

    /**
     * Try to covert the number, if the action is not allowed the method will return 0
     * @return the number (double)
     */
    private static double convertStringToDouble(String number){
        double convertedNumber = 0.0;
        try{
            convertedNumber = Double.parseDouble(number);
        }catch(Exception e){
            System.out.println("\t\t---> The number " + number + " is not a number.");
        }
        return convertedNumber;
    }
}
