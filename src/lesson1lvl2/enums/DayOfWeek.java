package lesson1lvl2.enums;

public enum DayOfWeek {
    Monday(8), Tuesday(8), Wednesday(8), Thursday(8), Friday(7), Saturday(0), Sunday(0);

    private int hour;

    DayOfWeek(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }
}
