public class Enciclopedie extends Publicatie {
    private int numarVolume;
    private String domeniu;
    private int numarArticole;
    private String editura;
    private boolean continePlanseColor;
    private String grupTinta;

    public Enciclopedie() {
        super();
        this.numarVolume = 0;
        this.domeniu = "";
        this.numarArticole = 0;
        this.editura = "";
        this.continePlanseColor = false;
        this.grupTinta = "";
    }

    public Enciclopedie(String titlu, String autor, int anAparitie, double pret,
                        int numarVolume, String domeniu, int numarArticole,
                        String editura, boolean continePlanseColor, String grupTinta) {
        super(titlu, autor, anAparitie, pret);
        this.numarVolume = numarVolume;
        this.domeniu = domeniu;
        this.numarArticole = numarArticole;
        this.editura = editura;
        this.continePlanseColor = continePlanseColor;
        this.grupTinta = grupTinta;
    }

    public Enciclopedie(Enciclopedie e) {
        super(e);
        this.numarVolume = e.numarVolume;
        this.domeniu = e.domeniu;
        this.numarArticole = e.numarArticole;
        this.editura = e.editura;
        this.continePlanseColor = e.continePlanseColor;
        this.grupTinta = e.grupTinta;
    }

    public int getNumarVolume() {
        return numarVolume;
    }

    public void setNumarVolume(int numarVolume) {
        this.numarVolume = numarVolume;
    }

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }

    public int getNumarArticole() {
        return numarArticole;
    }

    public void setNumarArticole(int numarArticole) {
        this.numarArticole = numarArticole;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public boolean isContinePlanseColor() {
        return continePlanseColor;
    }

    public void setContinePlanseColor(boolean continePlanseColor) {
        this.continePlanseColor = continePlanseColor;
    }

    public String getGrupTinta() {
        return grupTinta;
    }

    public void setGrupTinta(String grupTinta) {
        this.grupTinta = grupTinta;
    }

    @Override
    public String toString() {
        return "ENCICLOPEDIE\n" + super.toString() +
                "\nNumar volume: " + numarVolume +
                "\nDomeniu: " + domeniu +
                "\nNumar articole: " + numarArticole +
                "\nEditura: " + editura +
                "\nContine planse color: " + (continePlanseColor ? "Da" : "Nu") +
                "\nGrup tinta: " + grupTinta;
    }

    @Override
    public void afisareInformatii() {
        System.out.println(toString());
    }

    @Override
    public double calculPret() {
        return getPret() * 0.8;
    }
}
