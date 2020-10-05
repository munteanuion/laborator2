package md.utm;

public class Laptop extends Specificatii{
    String marca;
    int anul;
    int pretul;
    public Laptop(String marca, int anul, int pretul, String procesor, float freqprocesor, String masurafreq, int ram, String modelram, int caphard, String masurahard, String sistemOp){
        super( procesor, freqprocesor, masurafreq, ram, modelram, caphard, masurahard, sistemOp);
        this.marca = marca;
        this.anul = anul;
        this.pretul = pretul;

    }
    public String printall(){
        return (" Marca: " + this.marca + "\n Anul: " + this.anul + "\n Pretul: " + this.pretul + " lei\n Procesorul: " + this.procesor +
                "\n Frequency procesor: " + this.freqprocesor + " " + this.masurafreq + "\n Capacitate Ram: " + this.ram + " "
                + this.modelram + "\n Capacitate SSD: " + this.caphard + " " + this.masurahard + "\n Sitema de operare: " + this.sistemOp);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnul(int anul) {
        this.anul = anul;
    }

    public void setPretul(int pretul) {
        this.pretul = pretul;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnul() {
        return anul;
    }

    public int getPretul() {
        return pretul;
    }

    @Override
    public String getSistemOp() {
        return super.getSistemOp();
    }
}
