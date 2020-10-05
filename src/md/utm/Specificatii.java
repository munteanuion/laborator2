package md.utm;

public class Specificatii {
    String procesor;
    int ram;
    String modelram;
    int caphard;
    String masurahard;
    float freqprocesor;
    String masurafreq;

    public Specificatii(String procesor, float freqprocesor, String masurafreq, int ram, String modelram,  int caphard, String masurahard){
        this.procesor = procesor;
        this.ram = ram;
        this.modelram = modelram;
        this.caphard = caphard;
        this.masurahard = masurahard;
        this.freqprocesor = freqprocesor;
        this.masurafreq = masurafreq;
    }
}
