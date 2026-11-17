public class Revista extends Publicatie {
    private  String domeniu;
    private String periodicitate;

    public Revista(String titlu, String autor, int anAparitie,
                   double pret, String domeniu, String periodicitate) {

        super(titlu, autor, anAparitie, pret);
        this.domeniu = domeniu;
        this.periodicitate = periodicitate;
    }
    @Override
    public void afisareInformatii(){
        System.out.println("Revista:" + titlu);
        System.out.println("Autor: " + autor);
        System.out.println("Domeniu: " + domeniu);
        System.out.println("Periodicitate: " + periodicitate);

    }
    @Override
    public double calculPret(){
        return pret;
    }
}