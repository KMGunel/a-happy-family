package coders.aze.aHappyFamily;

public enum EDayOfWeek {
    MONDEY("I"),
    TUESDAY("II"),
    WEDNESDAY("III"),
    THURSDAY("IV"),
    FRIDAY("V"),
    SATURDAY("VI"),
    SUNDAY("VII");

    private String day;

    EDayOfWeek(String day) {
        this.day=day;
    }

    public String getDay() {
        return day;
    }
}
