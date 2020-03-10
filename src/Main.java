import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Enter a number to convert\nOR\n(type 'quit' to exit):");
                String toConvert = br.readLine();
                if (toConvert.equals("quit")) {
                    break;
                }
                else {
                    System.out.println("This number is a: (b)inary | (d)ecimal | (h)exadecimal number");
                    String convertingFromChar = br.readLine().toLowerCase();
                    System.out.println("The number I want is a: (b)inary | (d)ecimal | (h)exadecimal number");
                    String convertingToChar = br.readLine().toLowerCase();
                    System.out.printf("\nInput: %3s\nOutput: %s\n\n", toConvert, ConversionInterface.convertNumber(toConvert, convertingFromChar, convertingToChar));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
