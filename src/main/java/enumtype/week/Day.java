package enumtype.week;

public enum Day {
    SUNDAY(DayType.HOLYDAY),
    MONDAY(DayType.WORKDAY),
    TUESDAY(DayType.WORKDAY),
    WEDNESDAY(DayType.WORKDAY),
    THURSDAY(DayType.WORKDAY),
    FRIDAY(DayType.WORKDAY),
    SATURDAY(DayType.HOLYDAY);

    private final DayType dayType;

    Day(DayType dayType) {
        this.dayType = dayType;
    }

    public DayType getDayType() {
        return dayType;
    }

    public Day nextDay(Day day) {
        if (day.ordinal() == 6) {
            return Day.values()[0];
        } else {
            return Day.values()[day.ordinal() + 1];
        }
    }
}
