package md.utm;

public class Laptop extends Specificatii {

    String marca;
    int anul;
    int pretul;

    public Laptop(String marca, int anul, int pretul, String procesor, float freqprocesor, String masurafreq,
                  int ram, String modelram, int caphard, String masurahard, String sistemOp)
    {
        super( procesor, freqprocesor, masurafreq, ram, modelram, caphard, masurahard, sistemOp);
        this.marca = marca;
        this.anul = anul;
        this.pretul = pretul;

    }

    @Override
    public String toString() {
        return "Laptop{" + '\n' +
                "marca=" + marca + '\n' +
                "anul=" + anul + '\n' +
                "pretul=" + pretul +  '\n' +
                "procesor=" + procesor + '\n' +
                "ram=" + ram + '\n' +
                "modelram=" + modelram + '\n' +
                "caphard=" + caphard + '\n' +
                "masurahard=" + masurahard + '\n' +
                "freqprocesor=" + freqprocesor + '\n' +
                "masurafreq=" + masurafreq + '\n' +
                "sistemOp=" + sistemOp + '\n' +
                '}';
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
