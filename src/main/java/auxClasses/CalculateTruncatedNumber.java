package auxClasses;

import exercise.GlobalVariables;

public class CalculateTruncatedNumber {

    /**
     * Calculate the truncated number for millions.
     * @param number
     * @return trucated number.
     */
    private double getMillionsTruncated(double number){
        return number / GlobalVariables.oneMillion;
    }

    /**
     * Calculate the truncated number for billions.
     * @param number
     * @return trucated number.
     */
    private double getBillonTruncated(double number){
        return number / GlobalVariables.onebillion;
    }

    /**
     * Calculate the truncated number for trillions.
     * @param number
     * @return trucated number.
     */
    private double getTrillonTruncated(double number){
        return number / GlobalVariables.onetrillion;
    }

    /**
     * Return the number with the letter according to the number..
     * @param number
     * @return trucated number.
     */
    public String getTruncatedNumber(double number){
        double truncatedNumber;
        String truncatedNumberString = "0";
        String format;
        if(number < GlobalVariables.oneMillion){
            format = number % 1 == 0 ? "%.0f" : "%.1f";
            truncatedNumberString = String.format(format, number);
        }else
        if(number >= GlobalVariables.oneMillion & number < GlobalVariables.onebillion){
            truncatedNumber = getMillionsTruncated(number);
            format = truncatedNumber % 1 == 0 ? "%.0fM" : "%.1fM";
            truncatedNumberString = String.format(format, truncatedNumber);
        }else
        if(number >= GlobalVariables.onebillion & number < GlobalVariables.onetrillion){
            truncatedNumber = getBillonTruncated(number);
            format = truncatedNumber % 1 == 0 ? "%.0fB" : "%.1fB";
            truncatedNumberString = String.format(format, truncatedNumber);
        }
        else
        if(number >= GlobalVariables.onetrillion & number < GlobalVariables.oneCuatrillion){
            truncatedNumber = getTrillonTruncated(number);
            format = truncatedNumber % 1 == 0 ? "%.0fT" : "%.1fT";
            truncatedNumberString = String.format(format, truncatedNumber);
        }else
        if(number >= GlobalVariables.oneCuatrillion){
            System.out.println("Number greater than 1 trillion.");
            truncatedNumberString = Double.toString(number);
        }
        return  truncatedNumberString;
    }
}