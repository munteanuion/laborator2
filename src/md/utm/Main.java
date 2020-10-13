package md.utm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Laptop pc1 = new Laptop("HP", 2019,10000,"Intel Core i5, 10 TH Gen", 3.6f,
            "GHz", 8, "DDR4", 256, "GB", "Ubuntu 20.04");
        System.out.println(pc1.toString());
        System.out.println("\n***************************************");

        Scanner var = new Scanner(System.in);
        int var1;

        System.out.println("Introduceti Pretul nou al produsului: \n");
        var1 = var.nextInt();
        pc1.setPretul(var1);

        System.out.println("Introduceti Anul nou al produsului \n");
        var1 = var.nextInt();
        pc1.setAnul(var1);

        System.out.println("Introduceti capacitatea Ram noua al produsului: \n");
        var1 = var.nextInt();
        pc1.setRam(var1);

        System.out.println("\n***************************************");
        System.out.println(pc1.toString());
        System.out.println("\n***************************************");
        System.out.println(pc1.getSistemOp() + "\n" + pc1.getProcesor() + "\n" + pc1.getMarca());
    }
}
