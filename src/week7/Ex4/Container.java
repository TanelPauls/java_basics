package week7.Ex4;

import java.util.ArrayList;

public class Container {
    private ArrayList<Suitcase> containerItems = new ArrayList<Suitcase>();;
    private int weight;
    private int maxWeight;

    public Container(int weight) {
        this.containerItems = containerItems;
        this.weight = weight;
        this.maxWeight = weight;
    }
    public void addSuitcase(Suitcase suitcase){
        if(this.weight>=suitcase.totalWeight()){
            this.weight-=suitcase.totalWeight();
            this.containerItems.add(suitcase);
        }
    }
    public String toString(){
        if(this.containerItems.isEmpty()){
            return "empty (0 kg)";
        } else{
            if(this.containerItems.size() == 1){
                return this.containerItems.size()+" suitcases ("+(this.maxWeight-this.weight)+" kg)";
            } else{
                return this.containerItems.size()+" suitcases ("+(this.maxWeight-this.weight)+" kg)";
            }
        }
    }
    public void printThings(){
        for (Suitcase t : containerItems) {
            t.printThings();
        }
    }
    public int totalWeight(){
        int totalW=0;
        for (Suitcase t : containerItems) {
            totalW+=t.totalWeight();
        }
        return totalW;
    }
}
