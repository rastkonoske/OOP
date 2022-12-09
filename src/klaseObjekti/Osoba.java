package klaseObjekti;

public final class Osoba {

    private String Ime;
    private String Prezime;
    private String jmbg;
    private int brLK;

    public Osoba (String Ime, String Prezime, String jmbg, int brLK) {
        this.Ime = Ime;
        this.Prezime = Prezime;
        this.jmbg = jmbg;
        this.brLK = brLK;
    }


    public String getIme () {
        return Ime;
    }

    public String getPrezime () {
        return Prezime;
    }

    public String getJmbg () {
        return jmbg;
    }

    public int getBrLK () {
        return brLK;
    }

    public String ispis() {
        return this.getIme() + "_" + this.getPrezime();
    }

}
