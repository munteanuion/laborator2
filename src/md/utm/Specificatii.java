package md.utm;

public class Specificatii extends SistemulOperare
{

    String procesor;
    int ram;
    String modelram;
    int caphard;
    String masurahard;
    float freqprocesor;
    String masurafreq;

    public Specificatii(String procesor, float freqprocesor, String masurafreq, int ram, String modelram,  int caphard, String masurahard, String sistemOp)
    {
        super(sistemOp);
        this.procesor = procesor;
        this.ram = ram;
        this.modelram = modelram;
        this.caphard = caphard;
        this.masurahard = masurahard;
        this.freqprocesor = freqprocesor;
        this.masurafreq = masurafreq;
    }

    @Override
    public String toString() {
        return "Specificatii{" +
                "procesor= " + procesor + '\n' +
                "ram= " + ram + '\n' +
                "modelram= " + modelram + '\n' +
                "caphard= " + caphard + '\n' +
                "masurahard= " + masurahard + '\n' +
                "freqprocesor= " + freqprocesor + '\n' +
                "masurafreq= " + masurafreq + '\n' +
                '}';
    }

    @Override
    public void setSistemOp(String sistemOp) {
        super.setSistemOp(sistemOp);
    }

    public void setCaphard(int caphard) {
        this.caphard = caphard;
    }

    public void setFreqprocesor(float freqprocesor) {
        this.freqprocesor = freqprocesor;
    }

    public void setMasurafreq(String masurafreq) {
        this.masurafreq = masurafreq;
    }

    public void setMasurahard(String masurahard) {
        this.masurahard = masurahard;
    }

    public void setModelram(String modelram) {
        this.modelram = modelram;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getFreqprocesor() {
        return freqprocesor;
    }

    @Override
    public String getSistemOp() {
        return super.getSistemOp();
    }

    public int getCaphard() {
        return caphard;
    }

    public int getRam() {
        return ram;
    }

    public String getMasurafreq() {
        return masurafreq;
    }

    public String getMasurahard() {
        return masurahard;
    }

    public String getModelram() {
        return modelram;
    }

    public String getProcesor() {
        return procesor;
    }
}
