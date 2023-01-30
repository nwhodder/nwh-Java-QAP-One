package Time;

public class Time {
    //  Attributes
    private int hour;
    private int minute;
    private int second;

    //  Constructors
    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute, int second) {
        if ((hour < 23) && (0 <= hour)){
            this.hour = hour;
        }else {
            this.hour = 0;
        }
        if ((minute < 60) && (0 <= hour)){
            this.minute = minute;
        }else {
            this.minute = 0;
        }
        if ((hour < 60) && (0 <= hour)){
            this.second = second;
        }else {
            this.second = 0;
        }
    }

    //  Setters + Getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    //  Methods
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public Time nextSecond(){
        if (this.second == 59){
            setSecond(0);
            if (this.minute == 59){
                setMinute(0);
                if (this.hour == 23){
                    setHour(0);
                }else{
                    setHour(this.hour + 1);
                }
            }else {
                setMinute(this.minute + 1);
            }
        }else {
            setSecond(this.second + 1);
        }
        return this;
    }

    public Time previousSecond(){
        if (this.second == 0){
            setSecond(59);
            if (this.minute == 0){
                setMinute(59);
                if (this.hour == 0){
                    setHour(23);
                }else{
                    setHour(this.hour - 1);
                }
            }else {
                setMinute(this.minute - 1);
            }
        }else {
            setSecond(this.second - 1);
        }
        return this;
    }

}// End of class
