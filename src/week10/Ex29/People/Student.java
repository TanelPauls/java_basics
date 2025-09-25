package week10.Ex29.People;

public class Student extends Person{
    int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public int credits(){
        return this.credits;
    }

    public void study(){
        this.credits++;
    }

    @Override
    public String toString(){
        return this.name+"\n"+"  "+this.address+"\n"+"  credits "+this.credits;
    }
}
