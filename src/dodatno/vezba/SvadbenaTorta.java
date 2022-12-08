package dodatno.vezba;

public class SvadbenaTorta extends Torta{

    private int slojeva;

    public SvadbenaTorta(String ukus) {
        super(ukus);
    }

    public int getSlojeva() {
        return slojeva;
    }

    public void setSlojeva(int slojeva) {
        this.slojeva = slojeva;
    }
}
