package Time;

public class TestTime {
    public static void main(String[] args){
        Time t1 = new Time();
        t1.setHour(21);
        t1.setMinute(10);
        t1.setSecond(15);

        Time t2 = new Time();
        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        t1.nextSecond();
        t2.previousSecond();

        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }
}