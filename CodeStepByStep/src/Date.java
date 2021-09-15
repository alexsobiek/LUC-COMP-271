public class Date {
    private int month;
    private int date;

    public Date(int month, int date) {
        this.month = month;
        this.date = date;
    }


    public int getMonth() {
        return month;
    }

    public int getDay() {
        return date;
    }

    public int daysInMonth() {
        int days = 0;
        switch (month) {
            case 2:
                days = 28;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            default:
                days = 30;
        }
        return days;
    }

    public void nextDay() {
        if (date == daysInMonth()) {
            month++;
            if (month > 12) month = 1;
            date = 1;
        } else date++;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (month < 10) builder.append(0).append(month);
        else builder.append(month);
        builder.append("/");
        if (date < 10) builder.append(0).append(date);
        else builder.append(date);
        return builder.toString();
    }
}


