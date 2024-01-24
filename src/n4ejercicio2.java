

import java.util.*;

public class n4ejercicio2 {

    public static void main (String[] args) {

        Scanner myObj = new Scanner(System.in);

        calculoDNI numDNI = new calculoDNI();

        System.out.println("introduce el número del DNI");
        int numeroDNI = myObj.nextInt();

       System.out.println(calculoDNI.calculoDNI(numeroDNI));

    }
}