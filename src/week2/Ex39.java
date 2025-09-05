package week2;

public class Ex39{
    public static void printStars(int amount) {
        int x=0;
        while(x<amount){
            System.out.print("*");
            x++;
        }
        System.out.println();
    }
    public static void printSquare(int sideSize) {
        int x=0;
        while(x<sideSize){
            printStars(sideSize);
            x++;
        }
    }
    public static void printRectangle(int width, int height) {
        int x=0;
        while(x<height){
            printStars(width);
            x++;
        }
    }
    public static void printTriangle(int size) {
        int x=0;
        while(x<size){
            printStars(x+1);
            x++;
        }
    }
    public static void main(String[] args) {
        /*printStars(5);
        printStars(3);*/
        printStars(9);
        printSquare(4);
        printRectangle(17,3);
        printTriangle(4);
    }
}

