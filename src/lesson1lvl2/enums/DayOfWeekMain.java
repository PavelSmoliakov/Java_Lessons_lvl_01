package lesson1lvl2.enums;

public class DayOfWeekMain {
    public static int getWorkingHours(DayOfWeek currentDay) {
        int result = 0;
        for(int i = currentDay.ordinal(); i < DayOfWeek.values().length; i++)
            result += DayOfWeek.values()[i].getHour();
            return result;
    }

    public static void main(final String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.Monday));
    }
}
