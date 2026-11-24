public class Roman extends Publicatie{
    private String genLiterar;
    private int nrPagini;
    private String editura;
    private String tipCoperta;

    public Roman(){
        super();
        this.genLiterar="";
        this.nrPagini=0;
        this.editura="";
        this.tipCoperta="";
    }
    public Roman(String titlu, String autor, int anAparitie, double pret, String genLiterar, int nrPagini, String editura, String tipCoperta){
        super(titlu, autor, anAparitie, pret);
        this.genLiterar=genLiterar;
        this.nrPagini=nrPagini;
        this.editura=editura;
        this.tipCoperta=tipCoperta;
    }
    public Roman(Roman r){
        super(r);
        this.genLiterar=r.genLiterar;
        this.nrPagini=r.nrPagini;
        this.editura=r.editura;
        this.tipCoperta=r.tipCoperta;
    }
    public String getGenLiterar(){
        return genLiterar;
    }
    public void setGenLiterar(String genLiterar){
        this.genLiterar=genLiterar;
    }
    public int getNrPagini(){
        return nrPagini;
    }
    public void setNrPagini(int nrPagini){
        this.nrPagini=nrPagini;
    }
    public String getEditura(){
        return editura;
    }
    public void setEditura(String editura){
        this.editura=editura;
    }
    public String getTipCoperta(){
        return tipCoperta;
    }
    public void setTipCoperta(String tipCoperta){
        this.tipCoperta=tipCoperta;
    }

    @Override
    public String toString(){
        return "ROMAN\n" + super.toString()+
                "\nGen literar: "+ genLiterar+
                "\nNumar pagini: "+ nrPagini+
                "\nEditura: "+ editura+
                "\nTip coperta: "+tipCoperta;
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
