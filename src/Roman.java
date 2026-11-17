public class Roman extends Publicatie{
    private String genLiterar;
    private int nrPagini;
    public Roman(String titlu, String autor, int anAparitie, double pret, String genLiterar, int nrPagini){
        super(titlu, autor, anAparitie, pret);
        this.genLiterar=genLiterar;
        this.nrPagini=nrPagini;
    }
    @Override
    public void afisareInformatii(){
        System.out.println("Roman: "+titlu);
        System.out.println("Autor: "+autor);
        System.out.println("Gen literar: "+genLiterar);
        System.out.println("Numar pagini: "+nrPagini);
    }
    @Override
    public double calculPret(){
        return pret;
    }
}
