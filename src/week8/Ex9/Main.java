package week8.Ex9;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //9.1
        /*RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newReg = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(newReg)) {
            finnish.add(newReg);
        }
        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));*/

        //9.2 9.3
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        System.out.println(finnish);

        RegistrationPlate newReg = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(newReg)) {
            finnish.add(newReg);
        }
        System.out.println("Finnish: " + finnish);

        VehicleRegister register = new VehicleRegister();
        register.add(reg1, "Arto");
        register.add(reg3, "Jürgen");
        register.add(reg1, "Arto");
        System.out.println();
        System.out.println(register.get(reg1));
        System.out.println(register.get(reg2));
        System.out.println(register.get(reg3));
        System.out.println();
//        System.out.println(register.delete(reg1));
//        System.out.println(register.delete(reg1));
        System.out.println();
        register.printRegistrationPlates();
        System.out.println();
        register.printOwners();

    }
}
