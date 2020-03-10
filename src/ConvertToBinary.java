import java.util.Stack;

public class ConvertToBinary {

    public void fromDecToBin(int decimalNumber){
        Stack binaryDigitStack = new Stack();
        String binaryNumberString = "";
        while (decimalNumber > 0){
           binaryDigitStack.push(decimalNumber % 2);
           if (decimalNumber % 2 == 1){
               decimalNumber--;
           }
           decimalNumber /= 2;
        }
        for(int i = 0; i < binaryDigitStack.capacity(); i++){
            binaryNumberString += binaryDigitStack.pop();
        }
        System.out.println(binaryNumberString);
    }

    private char[] hexadecimalCharactersArray = {'a','b','c','d','e','f'};


    public void fromHexToBin(String hexString){
        char[] characterArray = hexString.toCharArray();
        int[] convertedNumbersArray = new int[hexString.length()];
        String[] convertedBinaryNumbersArray = new String[hexString.length()];
        String bigString = "";
        int k = 0;
        int f = 0;
        String binaryNumberString = "";

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
        for (int convertedNumber : convertedNumbersArray) {
            while (convertedNumber > 0) {
                binaryNumberString += convertedNumber % 2;
                if (convertedNumber % 2 == 1) {
                    convertedNumber--;
                }
                convertedNumber /= 2;
            }
            bigString += binaryNumberString;
        }
        System.out.println(bigString);
    }
}
