package week1;

import java.util.Scanner;

public class Ylesanded {
    public static void main(String[] args) {
        /*ylesanne01();
        ylesanne02();
        ylesanne03();
        ylesanne04();
        ylesanne05();
        ylesanne06();
        ylesanne07();
        ylesanne08();
        ylesanne09();
        ylesanne10();
        ylesanne11();
        ylesanne12();
        ylesanne14();
        ylesanne15();*/
        ylesanne16();

    }
    public static void vaherida() {
        System.out.println();
    }
    public static void ylesanne01() {
        vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        System.out.println("Tanel Pauls");
    }
    public static void ylesanne02() {
        vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        System.out.println("Hello world!");
        System.out.println("(And all the people of the world)");
    }
    public static void ylesanne03() {
        vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");
        System.out.println("    *");
    }
    public static void ylesanne04() {
        vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        System.out.println("Chickens:");
        int chickens=9000;
        System.out.println(chickens);
        System.out.println("Bacon (kg):");
        double bacon=0.1;
        System.out.println(bacon);
        System.out.println("A tractor:");
        String tractor="Zetor";
        System.out.println(tractor);
        System.out.println();
        System.out.println("In a nutshell:");
        System.out.println(chickens);
        System.out.println(bacon);
        System.out.println(tractor);
    }
    public static void ylesanne05() {
        vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        int daysInAYear=365;
        int secondsInAYear=daysInAYear*24*60*60;
        System.out.println("There are "+secondsInAYear+" seconds in a year.");
    }
    public static void ylesanne06() {
        vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        int x, y;
        x=5;
        y=4;
        System.out.println(x+" + "+y+" = "+(x+y));
        x=73457;
        y=12888;
        System.out.println(x+" + "+y+" = "+(x+y));
    }
    public static void ylesanne07() {
        vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        int x, y;
        x=2;
        y=8;
        System.out.println(x+" * "+y+" = "+ (x*y));
        x=277;
        y=111;
        System.out.println(x+" * "+y+" = "+(x*y));
    }
    public static void ylesanne08() {
        vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        Scanner sc=new Scanner(System.in);
        System.out.print("Type a number: ");
        int x=sc.nextInt();
        System.out.print("Type another number: ");
        int y=sc.nextInt();
        vaherida();
        System.out.println("Sum of the numbers: "+(x+y));

    }
    public static void ylesanne09() {
        vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        Scanner sc=new Scanner(System.in);
        System.out.print("Type a number: ");
        int x=sc.nextInt();
        System.out.print("Type another number: ");
        int y=sc.nextInt();
        vaherida();
        System.out.println("Division: "+x+" / "+y+" = "+ ((double) x/y));
    }
    public static void ylesanne10() {
        vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        Scanner sc=new Scanner(System.in);
        System.out.print("Type the radius: ");
        int x=sc.nextInt();
        vaherida();
        System.out.println("Circumference of the circle: "+(2*Math.PI*x));
    }
    public static void ylesanne11() {
        vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        Scanner sc=new Scanner(System.in);
        System.out.print("Type a number: ");
        int x=sc.nextInt();
        System.out.print("Type another number: ");
        int y=sc.nextInt();
        vaherida();
        System.out.println("The bigger number of the two numbers given was: "+ Math.max(x,y));
    }
    public static void ylesanne12() {
        vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());

        Scanner sc=new Scanner(System.in);
        System.out.print("Type your name: ");
        String name1=sc.next();
        System.out.print("Type your age: ");
        int age1=sc.nextInt();
        vaherida();
        System.out.print("Type your name: ");
        String name2=sc.next();
        System.out.print("Type your age: ");
        int age2=sc.nextInt();
        vaherida();
        System.out.println(name1+" and "+name2+" are "+(age1+age2)+" years old in total.");
    }
    public static void ylesanne14() {
        vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());

        Scanner sc=new Scanner(System.in);
        System.out.print("Type a number: ");
        int x=sc.nextInt();
        vaherida();
        if(x>0){
            System.out.println("The number is positive.");
        } else if(x<0){
            System.out.println("The number is not positive.");
        }
    }
    public static void ylesanne15() {
        vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());

        Scanner sc=new Scanner(System.in);
        System.out.print("How old are you: ");
        int x=sc.nextInt();
        vaherida();
        if(x<18){
            System.out.println("You have not reached the age of majority yet!");
        } else {
            System.out.println("You have reached the age of majority!");
        }
    }
    public static void ylesanne16() {
        vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());

        Scanner sc=new Scanner(System.in);
        System.out.print("Type a number: ");
        int x=sc.nextInt();
        vaherida();
        if(x%2==0){
            System.out.println("Number "+x+" is even.");
        } else {
            System.out.println("Number "+x+" is odd.");
        }
    }
    public static void ylesanne17() {
        /*vaherida();
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());

        Scanner sc=new Scanner(System.in);
        System.out.print("Type the first number: ");
        int  x=sc.nextInt();
        System.out.print("Type the second number: ");
        int y=sc.nextInt();
        vaherida();
        System.out.print("Type your name: ");*/

    }
}