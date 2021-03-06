package exceptionmulticatch.converter;


public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String str) {
        if (str == null) {
            throw new NullPointerException("binaryString null");
        }
        boolean[] result = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (Character.getNumericValue(str.charAt(i)) != 0 && Character.getNumericValue(str.charAt(i)) != 1) {
                throw new IllegalArgumentException("binaryString not valid");
            }
            result[i] = Character.getNumericValue(str.charAt(i)) == 0 ? false : true;
        }
        return result;
    }

    public String booleanArrayToBinaryString(boolean[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException();
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i] == true ? 1 : 0);
        }
        return result.toString();
    }

}
