public abstract class Publicatie implements PublicatieInterfata {
    private String titlu;
    private String autor;
    private int anAparitie;
    private double pret;

    public Publicatie(){
        this.titlu="";
        this.autor="";
        this.anAparitie=0;
        this.pret=0;
    }
    public Publicatie(String titlu, String autor, int anAparitie, double pret){
        this.titlu=titlu;
        this.autor=autor;
        this.anAparitie=anAparitie;
        this.pret=pret;
    }
    public Publicatie(Publicatie p){
        this.titlu=p.titlu;
        this.autor=p.autor;
        this.anAparitie=p.anAparitie;
        this.pret=p.pret;
    }
    public String getTitlu(){
        return titlu;
    }
    public void setTitlu(String titlu){
        this.titlu=titlu;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public int getAnAparitie(){
        return anAparitie;
    }
    public void setAnAparitie(int anAparitie){
        this.anAparitie=anAparitie;
    }
    public double getPret(){
        return pret;
    }
    public void setPret(double pret){
        this.pret=pret;
    }
    @Override
    public String toString(){
        return "Titlu: "+titlu+
                "\nAutor: "+autor+
                "\nAn aparitie: "+anAparitie+
                "\nPret: "+pret;
    }
}
