package exceptionclass.course;

public class SimpleTime {

    private int hour;

    private int minute;

    public SimpleTime(int hour, int minute) {
        if (hour < 1 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if (minute < 1 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String time) {
        try {
            int hour = Integer.parseInt(time.split(":")[0]);
            int minute = Integer.parseInt(time.split(":")[1]);
            this.hour = new SimpleTime(hour, minute).getHour();
            this.minute = new SimpleTime(hour, minute).getMinute();
        } catch (NullPointerException npe) {
            throw new InvalidTimeException("Time is null");
        } catch (NumberFormatException nfe) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }
}
