public class Revista extends Publicatie {
    private  String domeniu;
    private String periodicitate;
    private int numarPagini;

    // Constructor fara argumente
    public Revista() {
        super(); // Apeleaza constructorul clasei parinte
        this.domeniu = "";
        this.periodicitate = "";
        this.numarPagini = 0;
    }


        // Constructor cu toti parametrii

    public Revista(String titlu, String autor,
                   int anAparitie, double pret, String domeniu,
                   String periodicitate,int numarPagini)
    {

            // Transmite atributele mostenite catre clasa parinte
            super(titlu, autor, anAparitie, pret);

            // Initializarea atributelor proprii
            this.domeniu = domeniu;
            this.periodicitate = periodicitate;
            this.numarPagini = numarPagini;
        }

        // Constructor de copiere
    public Revista(Revista r) {
            super(r); // Copiaza atributele din clasa parinte
            this.domeniu = r.domeniu;
            this.periodicitate = r.periodicitate;
            this.numarPagini = r.numarPagini;
        }

    // Getter pentru domeniu
    public String getDomeniu() {
        return domeniu;
    }

    // Setter pentru domeniu
    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }

    // Getter pentru periodicitate
    public String getPeriodicitate() {
        return periodicitate;
    }

    // Setter pentru periodicitate
    public void setPeriodicitate(String periodicitate) {
        this.periodicitate = periodicitate;
    }

    // Getter pentru numarul de pagini
        public int getNumarPagini() {
            return numarPagini;
        }

        // Setter pentru numarul de pagini
        public void setNumarPagini(int numarPagini) {
            this.numarPagini = numarPagini;
        }
    @Override
    public String toString() {
        return "REVISTA\n" + super.toString() +
                "\nDomeniu: " + domeniu +
                "\nPeriodicitate: " + periodicitate +
                "\nNumar pagini: " + numarPagini;
    }

    @Override
    public void afisareInformatii() {
        System.out.println(toString());
    }
    @Override
    public double calculPret(){
        return getPret();
    }
}