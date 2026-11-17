public abstract class Publicatie implements PublicatieInterfata {
    protected String titlu;
    protected String autor;
    protected int anAparitie;
    protected double pret;

    public Publicatie(String titlu, String autor, int anAparitie, double pret){
        this.titlu=titlu;
        this.autor=autor;
        this.anAparitie=anAparitie;
        this.pret=pret;
    }
}
