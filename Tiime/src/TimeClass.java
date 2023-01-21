public class TimeClass {
    int hour;
    int minute;
    int second;
    public TimeClass(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "0" + hour + ":0" + minute + ":0" + second;
    }

    public void setTimeClass(int hour, int minute, int second) {
        this.minute = minute;
        this.second = second;
        this.hour = hour;

    }

    public void nextSecond


}

