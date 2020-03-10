
public class ConversionInterface {

    public static String convertNumber(String toConvert, String convertingFromChar, String convertingToChar) {
        boolean onlyOneConversionNeeded = convertingToChar.contains("d");
        if (convertingFromChar.length() > 1 || convertingToChar.length() > 1){
           return "One or more type choice was incorrect";
       }
        if (onlyOneConversionNeeded){
            return String.valueOf(initialConversion(toConvert, convertingFromChar));
        }
        return secondaryConversion(initialConversion(toConvert, convertingFromChar), convertingToChar);

    }

    private static int initialConversion(String toConvert, String convertingFromChar) {
        if (convertingFromChar.contains("b")){
            return ConvertTo.decimalFromBinary(Integer.parseInt(toConvert));
        } else if (convertingFromChar.contains("d")) {
            return Integer.parseInt(toConvert);
        }
        else if (convertingFromChar.contains("h")){
            return ConvertTo.decimalFromHexadecimal(toConvert);
        } else {
            return 0;
        }

    }

    private static String secondaryConversion(int toConvert, String convertingToChar) {
        if (convertingToChar.contains("b")) {
            return ConvertTo.binaryFromDecimal(toConvert);
        }
        else if (convertingToChar.contains("h")){
            return ConvertTo.hexadecimalFromDecimal(toConvert);
        }
        else{
            return "0";
        }
    }
}
