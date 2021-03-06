package week06d01;

import java.util.List;

public class ListSelector {


    public String concatEvenIndexElements(List<String> lista) {
        if (lista == null) {
            throw new NullPointerException("List must be not null.");
        }
        if (lista.size() == 0) {
            return "";
        }
        String result = "[";
        for (int i = 0; i < lista.size(); i += 2) {
            result += lista.get(i) + ",";
        }
        result = result.substring(0, result.length() - 1);
        result += "]";
        return result;
    }
}
