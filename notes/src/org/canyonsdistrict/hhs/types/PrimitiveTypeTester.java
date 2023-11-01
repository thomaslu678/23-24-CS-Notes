package org.canyonsdistrict.hhs.types;

import java.sql.SQLOutput;

public class PrimitiveTypeTester {

    public static void main(String[] args) {

        System.out.println(6); //<- number literal, magic number

        int n = 1_000_000;
        System.out.println(n*n);

        long nl = 1_000_000;
        System.out.println(nl*nl);

        double dn = 3.35;
        System.out.println(dn*100);

        double dn2 = 4.35;
        System.out.println(dn2*1000);

        long nn = n; // implicit cast
        int n3 = (int) nn; // explicit cast
        double dd = nn;
        long ll = (long) dd;

        /*

        PEMDAS

         */

        System.out.println(7.0/4.0);
        System.out.println(7/4);

    }

}
