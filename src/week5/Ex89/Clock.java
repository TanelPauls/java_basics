package week5.Ex89;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hour = hoursAtBeginning;
        this.minute = minutesAtBeginning;
        this.second = secondsAtBeginning;
    }

    public void tick(){
        if(this.second<59){
            this.second++;
        } else {
            if(this.minute<59){
                this.minute++;
                this.second=0;
            } else {
                if(this.hour<23){
                    this.hour++;
                    this.minute=0;
                    this.second=0;
                } else {
                    this.hour=0;
                    this.minute=0;
                    this.second=0;
                }
            }
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}
