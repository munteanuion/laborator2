package md.utm;

public class SistemulOperare
{
    String sistemOp;

    public SistemulOperare( String sistemOp)
    {
        this.sistemOp = sistemOp;
    }

    public void setSistemOp(String sistemOp) {
        this.sistemOp = sistemOp;
    }

    public String getSistemOp() {
        return sistemOp;
    }

    @Override
    public String toString() {
        return "SistemulOperare{" +
                "sistemOp= " + sistemOp + '\n' +
                '}';
    }
}
