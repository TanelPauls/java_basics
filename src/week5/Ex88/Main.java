package week5.Ex88;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);

        System.out.println();

        ArrayList<Student> list = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        while(true){
            System.out.print("name: ");
            String name = reader.nextLine();
            if(name.isEmpty()){
                break;
            }

            System.out.print("studentnumber: ");
            String studentnumber = reader.nextLine();
            list.add(new Student(name, studentnumber));
        }

        System.out.println();

        for(Student student : list){
            System.out.println(student);
        }

        System.out.println();

        System.out.print("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result: ");
        for( Student student : list){
            if(student.getName().contains(term)){
                System.out.println(student);
            }
        }
    }
}
