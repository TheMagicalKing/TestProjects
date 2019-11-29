package TimeLiang;



public class Time {

    private long hour;
    private long minute;
    private long second;
    long nu = System.currentTimeMillis();

    public Time(){
        long totalSeconds = System.currentTimeMillis();
        long totalMinutes = totalSeconds/60;
        long totalHours = totalMinutes/60;
        this.hour = totalHours % 24;
        this.minute = totalMinutes% 60;
        this.second = totalSeconds& 60;
    }
    public Time(int hour,int  minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        this.hour = totalHours % 24;
        this.minute = totalMinutes % 60;
        this.second = totalSeconds % 60;
    }



    public long getHour() {
        return hour;
    }


    public long getMinute() {
        return minute;
    }


    public long getSecond() {
        return second;
    }
    public long setHour(int hour) {
        this.hour=hour*3600000;
        return this.hour;
    }


    public long setMinute(int minute) {
        this.minute=minute*60000;
        return this.minute;
    }


    public long setSecond(int second) {
        this.second=second*1000;
        return second;
    }

}
