
public class Ziar extends Publicatie {

    // Atributele private specifice clasei Ziar
    private String editie;
    private String localitate;
    private int numarPagini;

    // Constructor fara argumente
    public Ziar() {
        super(); // Apeleaza constructorul clasei parinte
        this.editie = "";
        this.localitate = "";
        this.numarPagini = 0;
    }

    // Constructor cu toti parametrii
    public Ziar(String titlu, String autor, int anAparitie,
                double pret, String editie, String localitate,
                int numarPagini) {

        // Transmite atributele mostenite catre clasa parinte
        super(titlu, autor, anAparitie, pret);

        // Initializarea atributelor proprii
        this.editie = editie;
        this.localitate = localitate;
        this.numarPagini = numarPagini;
    }

    // Constructor de copiere
    public Ziar(Ziar z) {
        super(z); // Copiaza atributele din clasa parinte
        this.editie = z.editie;
        this.localitate = z.localitate;
        this.numarPagini = z.numarPagini;
    }

    // Getter pentru editie
    public String getEditie() {
        return editie;
    }

    // Setter pentru editie
    public void setEditie(String editie) {
        this.editie = editie;
    }

    // Getter pentru localitate
    public String getLocalitate() {
        return localitate;
    }

    // Setter pentru localitate
    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    // Getter pentru numarul de pagini
    public int getNumarPagini() {
        return numarPagini;
    }

    // Setter pentru numarul de pagini
    public void setNumarPagini(int numarPagini) {
        this.numarPagini = numarPagini;
    }

    // Metoda care returneaza toate caracteristicile ziarului
    @Override
    public String toString() {
        return "ZIAR\n" + super.toString() +
                "\nEditie: " + editie +
                "\nLocalitate: " + localitate +
                "\nNumar pagini: " + numarPagini;
    }

    // Metoda de afisare a informatiilor
    @Override
    public void afisareInformatii() {
        System.out.println(toString());
    }

    // Metoda de calculare a pretului
    @Override
    public double calculPret() {
        return getPret();
    }
}
