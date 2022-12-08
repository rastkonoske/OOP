package dodatno.vezba;

public class RodjendanskaTorta extends Torta{

    private int svece;

    public RodjendanskaTorta(String ukus) {
        super(ukus);
    }

    public void setSvece(int svece) {
        this.svece = svece;
    }

    public int getSvece() {
        return svece;
    }
}
