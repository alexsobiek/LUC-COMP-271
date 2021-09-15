/*
Define a class named TimeSpan. A TimeSpan object stores a span of time in hours and minutes (for example, the time span
between 8:00am and 10:30am is 2 hours, 30 minutes). Each TimeSpan object should have the following public methods:

new TimeSpan(hours, minutes)
Constructs a TimeSpan object storing the given time span of hours and minutes.
getHours()
Returns the number of hours in this time span.
getMinutes()
Returns the number of minutes in this time span, between 0 and 59.
add(hours, minutes)
Adds the given amount of time to the span. For example, (2 hours, 15 min) + (1 hour, 45 min) = (4 hours). Assume that
the parameters are valid: the hours are non-negative, and the minutes are between 0 and 59.
add(timespan)
Adds the given amount of time (stored as a time span) to the current time span.
getTotalHours()
Returns the total time in this time span as the real number of hours, such as 9.75 for (9 hours, 45 min).
toString()
Returns a string representation of the time span of hours and minutes, such as "28h46m".
The minutes should always be reported as being in the range of 0 to 59. That means that you may have to "carry"
60 minutes into a full hour.
 */

public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        adjustTime();
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    private void adjustTime() {
        this.hours += minutes / 60;
        this.minutes %= 60;
    }

    public void add(int hours, int minutes) {
        this.hours += hours;
        this.minutes += minutes;
        adjustTime();
    }


    public void add(TimeSpan timespan) {
        hours += timespan.getHours();
        minutes += timespan.getMinutes();
        adjustTime();
    }

    public void subtract(TimeSpan timespan) {
        hours -= timespan.getHours();
        minutes -= timespan.getMinutes();
        if (minutes < 0) {
            minutes+= 60;
            hours--;
        }
    }

    public void scale(int factor) {
        hours *= factor;
        minutes *= factor;
        adjustTime();
    }


    public float getTotalHours() {
        return hours + ((float) minutes / 60);
    }

    public String toString() {
        return hours + "h" + minutes + "m";
    }
}


class Test {
    public static void main(String[] args) {
        TimeSpan test = new TimeSpan(8, 40);
        TimeSpan test1 = new TimeSpan(8, 65);
        System.out.println(test);
        System.out.println(test1);

    }
}

