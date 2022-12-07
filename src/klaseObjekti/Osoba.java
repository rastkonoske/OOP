package klaseObjekti;

public final class Osoba {

    private String Ime;
    private String Prezime;
    private long jmbg;
    private int brLK;

    public Osoba (String Ime, String Prezime, long jmbg, int brLK) {
        this.Ime = Ime;
        this.Prezime = Prezime;
        this.jmbg = jmbg;
        this.brLK = brLK;
    }

    public void setIme(String ime) {
        Ime = ime;
    }

    public void setPrezime(String prezime) {
        Prezime = prezime;
    }

    public void setJmbg(long jmbg) {
        this.jmbg = jmbg;
    }

    public void setBrLK(int brLK) {
        this.brLK = brLK;
    }

    public String getIme () {
        return Ime;
    }

    public String getPrezime () {
        return Prezime;
    }

    public long getJmbg () {
        return jmbg;
    }

    public int getBrLK () {
        return brLK;
    }

    public String ispis() {
        return this.getIme() + "_" + this.getPrezime();
    }

}
