public class Manual extends Publicatie{
    private String materie;
    private int nrPagini;
    public Manual(String titlu, String autor, int anAparitie, double pret, String materie, int nrPagini){
        super(titlu, autor, anAparitie, pret);
        this.materie=materie;
        this.nrPagini=nrPagini;
    }
    @Override
    public void afisareInformatii(){
        System.out.println("Manual: "+titlu);
        System.out.println("Autor: "+autor);
        System.out.println("An aparitie: "+anAparitie);
        System.out.println("Materie: "+ materie);
        System.out.println("Numar pagini: "+nrPagini);
    }
    @Override
    public double calculPret(){
    return pret;
}
}

