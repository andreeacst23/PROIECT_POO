public class Dictionar extends Publicatie {
    private String limba;
    private int numarCuvinte;
    private String tipDictionar;
    private String editura;
    private boolean editieRevizuita;
    private String formatDictionar;

    public Dictionar() {
        super();
        this.limba = "";
        this.numarCuvinte = 0;
        this.tipDictionar = "";
        this.editura = "";
        this.editieRevizuita = false;
        this.formatDictionar = "";
    }

    public Dictionar(String titlu, String autor, int anAparitie, double pret,
                     String limba, int numarCuvinte, String tipDictionar,
                     String editura, boolean editieRevizuita, String formatDictionar) {
        super(titlu, autor, anAparitie, pret);
        this.limba = limba;
        this.numarCuvinte = numarCuvinte;
        this.tipDictionar = tipDictionar;
        this.editura = editura;
        this.editieRevizuita = editieRevizuita;
        this.formatDictionar = formatDictionar;
    }

    public Dictionar(Dictionar d) {
        super(d);
        this.limba = d.limba;
        this.numarCuvinte = d.numarCuvinte;
        this.tipDictionar = d.tipDictionar;
        this.editura = d.editura;
        this.editieRevizuita = d.editieRevizuita;
        this.formatDictionar = d.formatDictionar;
    }

    public String getLimba() {
        return limba;
    }

    public void setLimba(String limba) {
        this.limba = limba;
    }

    public int getNumarCuvinte() {
        return numarCuvinte;
    }

    public void setNumarCuvinte(int numarCuvinte) {
        this.numarCuvinte = numarCuvinte;
    }

    public String getTipDictionar() {
        return tipDictionar;
    }

    public void setTipDictionar(String tipDictionar) {
        this.tipDictionar = tipDictionar;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public boolean isEditieRevizuita() {
        return editieRevizuita;
    }

    public void setEditieRevizuita(boolean editieRevizuita) {
        this.editieRevizuita = editieRevizuita;
    }

    public String getFormatDictionar() {
        return formatDictionar;
    }

    public void setFormatDictionar(String formatDictionar) {
        this.formatDictionar = formatDictionar;
    }

    @Override
    public String toString() {
        return "DICTIONAR\n" + super.toString() +
                "\nLimba: " + limba +
                "\nNumar cuvinte: " + numarCuvinte +
                "\nTip dictionar: " + tipDictionar +
                "\nEditura: " + editura +
                "\nEditie revizuita: " + (editieRevizuita ? "Da" : "Nu") +
                "\nFormat: " + formatDictionar;
    }

    @Override
    public void afisareInformatii() {
        System.out.println(toString());
    }

    @Override
    public double calculPret() {
        return getPret() * 0.5;
    }
}
