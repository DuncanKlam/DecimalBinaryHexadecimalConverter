import java.util.Scanner;

public class Converter {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        ConvertToDecimal Decimal = new ConvertToDecimal();
        ConvertToBinary Binary = new ConvertToBinary();

        System.out.println("Enter Decimal Number: ");
        int decimalNumber = keyboard.nextInt();
        /*
        System.out.println("Enter Binary Number: ");
        int binaryNumber = keyboard.nextInt();
        */
        System.out.println("Enter Hexadecimal Number: ");
        String hexadecimalNumber = keyboard.next();
        /*
        Decimal.fromBinToDec(binaryNumber);
        Decimal.fromHexToDec(hexadecimalNumber);
        */
        Binary.fromDecToBin(decimalNumber);
        Binary.fromHexToBin(hexadecimalNumber);
    }
}
