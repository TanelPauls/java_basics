package week5.Ex89;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int startAt, int upperLimit) {
        this.value = startAt;
        this.upperLimit = upperLimit;
    }
    public void next() {
        if (this.value < this.upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }
    }
    public String toString() {
        return ""+this.value;
    }
}
