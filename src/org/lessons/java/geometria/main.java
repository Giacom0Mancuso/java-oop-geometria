package org.lessons.java.geometria;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rettangolo rettangolo = new Rettangolo();
        int altezza = Integer.parseInt(scanner.nextLine());
        System.out.println("Altezza: " + altezza);
        int base = Integer.parseInt(scanner.nextLine());
        System.out.println("Base: " + base);

        rettangolo.calcolaPerimetro(altezza, base);
        rettangolo.calcolaArea(altezza, base);
        System.out.println(rettangolo.getInfoPerimetro());
        System.out.println(rettangolo.getInfoArea());
    }
}
