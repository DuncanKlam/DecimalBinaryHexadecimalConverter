import java.lang.reflect.Array;

public class ConvertToDecimal {

    private int decimalNumber = 0;

    public void fromBinToDec(int binaryNumber){
        int binaryNumberArray[] = indexNumberIntoArray(binaryNumber);

        for (int i = 0; i < binaryNumberArray.length; i++){
            int indexValue = (int) (binaryNumberArray[i] * (Math.pow(2,i)));
            decimalNumber += indexValue;}
        System.out.println("Final Number: " + decimalNumber);
    }

    private int calculateNumberOfDigits(int binaryNumber){
        int count = 0;
        int n = binaryNumber;
        while (n != 0)
        {n /= 10; count++;}
        return count;
    }

    private int[] indexNumberIntoArray(int aBinaryNumber){
        int numberOfDigits = calculateNumberOfDigits(aBinaryNumber);
        int[] NumberArray = new int[numberOfDigits];
        numberOfDigits = 0;
        while (aBinaryNumber != 0){
            NumberArray[numberOfDigits] = aBinaryNumber % 10;
            aBinaryNumber /= 10;
            numberOfDigits++;
        }
        return NumberArray;
    }

    private char[] hexadecimalCharactersArray = {'a','b','c','d','e','f'};

    public void fromHexToDec(String hexString){
        char[] characterArray = hexString.toCharArray();
        int[] convertedNumbersArray = new int[hexString.length()];
        int k = 0;
        for (char hexSingle : characterArray){
            if(Character.isDigit(hexSingle)){
                convertedNumbersArray[k] = Character.getNumericValue(hexSingle);
            }
            if(Character.isLetter(hexSingle)){
                for (int j = 0; j < hexadecimalCharactersArray.length; j++){
                    if (Character.toLowerCase(hexSingle) == hexadecimalCharactersArray[j]){
                        convertedNumbersArray[k] = j + 10;
                    }
                }
            }
            k++;
        }
        //now we have array with numbers in it
        int sum = convertedNumbersArray[convertedNumbersArray.length-1];
        for (int i = 0; i < convertedNumbersArray.length - 1; i++){
            sum += (convertedNumbersArray[i] * Math.pow(16,convertedNumbersArray.length - 1 - i));
        }
        System.out.println(sum);
    }
}
