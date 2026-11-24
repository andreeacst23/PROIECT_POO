public class Manual extends Publicatie{
    private String materie;
    private int nrPagini;
    private String nivelStudiu;
    private String editura;

    public Manual(){
        super();
        this.materie="";
        this.nrPagini=0;
        this.nivelStudiu="";
        this.editura="";
    }
    public Manual(String titlu, String autor, int anAparitie, double pret, String materie, int nrPagini, String nivelStudiu, String editura){
        super(titlu, autor, anAparitie, pret);
        this.materie=materie;
        this.nrPagini=nrPagini;
        this.nivelStudiu=nivelStudiu;
        this.editura=editura;
    }
    public Manual(Manual m){
        super(m);
        this.materie=m.materie;
        this.nrPagini=m.nrPagini;
        this.nivelStudiu=m.nivelStudiu;
        this.editura=m.editura;
    }
    public String getMaterie(){
        return materie;
    }
    public void setMaterie(String materie){
        this.materie=materie;
    }
    public int getNrPagini(){
        return nrPagini;
    }
    public void setNrPagini(int nrPagini){
        this.nrPagini=nrPagini;
    }
    public String getNivelStudiu(){
        return nivelStudiu;
    }
    public void setNivelStudiu(String nivelStudiu){
        this.nivelStudiu=nivelStudiu;
    }
    public String getEditura(){
        return editura;
    }
    public void setEditura(String editura){
        this.editura=editura;
    }

    @Override
    public String toString(){
        return "MANUAL\n"+super.toString()+
                "\nMaterie: "+materie+
                "\nNumar pagini: "+nrPagini+
                "\nNivel studiu: "+nivelStudiu+
                "\nEditura: "+editura;
    }
    @Override
    public void afisareInformatii(){
        System.out.println(toString());
    }
    @Override
    public double calculPret(){
        return getPret();
    }
}

