package auxClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumberFromUser {

    /**
     * Ask number to the user
     * @return the number
     * @throws IOException
     */
    public static String getNumber() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Insert the number: ");
        String number = buffer.readLine();
        return number;
    }
}
