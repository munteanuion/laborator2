package md.utm;

public class Main {

    public static void main(String[] args) {
    Laptop pc1 = new Laptop("HP", 2019,10000,"Intel Core i5, 10 TH Gen", 3.6f,
            "GHz", 8, "DDR4", 256, "GB", "Ubuntu 20.04");
        System.out.println(pc1.printall());
        System.out.println("\n***************************************");
        pc1.setPretul(9500);
        pc1.setAnul(2020);
        pc1.setRam(16);
        System.out.println(pc1.printall());
        System.out.println("\n***************************************");
        System.out.println(pc1.getSistemOp() + "\n" + pc1.getProcesor() + "\n" + pc1.getMarca());
    }
}
