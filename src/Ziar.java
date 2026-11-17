public class Ziar extends Publicatie {
    private final String editie;
    private final String localitate;

    public Ziar(String titlu, String autor, int anAparitie,
                double pret, String editie, String localitate) {

        super(titlu, autor, anAparitie, pret);

        this.editie = editie;
        this.localitate = localitate;
    }
    @Override
    public void afisareInformatii(){
        System.out.println("Ziar: " + titlu);
        System.out.println("Autor: " + autor);
        System.out.println("Editie: " + editie);
        System.out.println("Localitate " + localitate);
    }
    @Override
    public double calculPret(){
        return pret;
    }
}
