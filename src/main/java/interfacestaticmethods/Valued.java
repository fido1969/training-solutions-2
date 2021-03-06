package interfacestaticmethods;

import java.util.List;

public interface Valued {

    double getValued();

    private static double sum(List<Valued> values) {
        double sum = 0;
        for (Valued valued : values) {
            sum += valued.getValued();
        }
        return sum;
    }

    static double totalValue(List<Valued> values){
        return sum(values);
    }
}
