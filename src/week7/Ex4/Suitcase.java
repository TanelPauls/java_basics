package week7.Ex4;


import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things = new ArrayList<Thing>();;
    private int weight;
    private int maxWeight;

    public Suitcase(int weight) {
        this.things = things;
        this.weight = weight;
        this.maxWeight = weight;
    }

    public void addThing(Thing thing){
        if(this.weight>=thing.getWeight()){
            this.weight-=thing.getWeight();
            this.things.add(thing);
        }
    }
    public String toString(){
        if(this.things.isEmpty()){
            return "empty (0 kg)";
        } else{
            if(this.things.size() == 1){
                return this.things.size()+" thing ("+(this.maxWeight-this.weight)+" kg)";
            } else{
                return this.things.size()+" things ("+(this.maxWeight-this.weight)+" kg)";
            }
        }
    }
    public void printThings(){
        for (Thing t : things) {
            System.out.println(t); // calls toString()
        }
    }
    public int totalWeight(){
        int totalW=0;
        for (Thing t : things) {
            totalW+=t.getWeight();
        }
        return totalW;
    }

    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }

        Thing heaviestItem = things.get(0); // start with the first item
        for (Thing t : things) {
            if (t.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = t;
            }
        }
        return heaviestItem;
    }
}
