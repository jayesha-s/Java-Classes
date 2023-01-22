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

    public TimeClass nextSecond ()
    {
        if (second == 59)
        {
            if (minute == 59)
            {
                if (hour ==23)
                {
                    this.hour = 0;
                }
                this.minute=0;
            }
            this.second=0;
        }
        else
        {
            this.second = second + 1;
        }
        return this;
    }
    public TimeClass previousSecond ()
    {
        if (second == 0)
        {
            if (minute == 0)
            {
                if (hour == 0)
                {
                    this.hour = 23;
                }
                this.minute=59;
            }
            this.second=59;
        }
        else
        {
            this.second = second - 1;
        }
        return this;
    }


}

