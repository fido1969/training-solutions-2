package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    public List<DayType> dayTypes(Day firstDay, int numbersOfDays) {
        List<DayType> dayTypes = new ArrayList<>();
        Day day = firstDay;
        for (int i = 0; i < numbersOfDays; i++) {
            dayTypes.add(day.getDayType());
            day = day.nextDay(day);
        }
        return dayTypes;
    }
}
