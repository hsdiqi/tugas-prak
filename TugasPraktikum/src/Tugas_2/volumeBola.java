package Tugas_2;
/**
 * @author Hasbi Ash S.
 * NIM : 202210370311391
 */

import java.util.Scanner;

public class volumeBola {
    double r;

    /**
     *
     * @param r
     * r adalah jari-jari dari bola
     */
    public volumeBola(double r) {
        this.r = r;
    }


    /**
     *
     * @return mengembalikan nilai r
     */
    public double getR() {
        return r;
    }

    public double hitungVolumeBola() {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aplikasi ini digunakan untuk menghitung volume bangun ruang yakni Bola");
        System.out.println("Dengan rumus 4/3*Phi*r^3 \n");
        System.out.print("Masukkan nilai jari-jari: ");
        double jariJari = sc.nextDouble();

        volumeBola vB = new volumeBola(jariJari);
        double volume = vB.hitungVolumeBola();

        System.out.println("Volume bola dengan jari-jari " + vB.getR() + " adalah: " + volume);
    }
}
