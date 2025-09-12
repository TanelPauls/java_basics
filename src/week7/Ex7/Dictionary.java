package week7.Ex7;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> collection;

    public Dictionary() {
        this.collection = new HashMap<String, String>();
    }

    public void add(String string1, String string2) {

        if(this.collection.containsKey(string1)) {
            System.out.println("This word is already translated");
        } else {
            this.collection.put(string1, string2);
        }
    }

    public String translate(String word) {
        if(!this.collection.containsKey(word)) {
            return null;
        }else {
            return this.collection.get(word);
        }
    }

    /*public void add(String word, String translation){*/

}