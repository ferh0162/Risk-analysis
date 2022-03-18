package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Risk analysis:");
        System.out.println();

        boolean loop = true;
        while (loop) {
            Scanner sc = new Scanner(System.in);

            System.out.println(" Skriv Risiko tilfælde:");
            String riskName = sc.nextLine();

            System.out.println();
            System.out.println("Skriv Sandsynlighed for at risikoen indtræffer: 1-5");
            int pro = sc.nextInt();

            System.out.println();
            System.out.println("Skriv konsekvensens størrelse hvis risikoen indtræffes: 1-5");
            int con = sc.nextInt();

            System.out.println();
            System.out.println("Alvorligheden af risikoen");
            int beregning = con * pro;

            String level = null;

            if (beregning < 5) {
                level = "VERY LOW";
            } else if (5 < beregning && beregning < 10) {
                level = "LOW";
            } else if (10 < beregning && beregning < 15) {
                level = "MEDIUM";
            } else if (15 < beregning && beregning < 20) {
                level = "HIGH";
            } else if (20 < beregning && beregning < 25) {
                level = "VERY HIGH";
            } else {
                System.out.println("fejl prøv igen");
            }

            System.out.println("#1 " + riskName + "\t\t\t" + pro + "\t\t" + con + "\t\t" + beregning + "\t\t\t" + level);
        }

    }
}
