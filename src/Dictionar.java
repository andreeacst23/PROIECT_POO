public class Dictionar extends Publicatie {
    private String limba;
    private int numarCuvinte;

    public Dictionar(String titlu, String autor, int anAparitie, double pret, String limba, int numarCuvinte){
        super(titlu, autor, anAparitie, pret);
        this.limba = limba;
        this.numarCuvinte = numarCuvinte;
    }

    @Override
    public void afisareInformatii(){
        System.out.println("Dictionar: "+titlu);
        System.out.println("Autor: "+autor);
        System.out.println("An Aparitie: "+anAparitie);
        System.out.println("Limba: "+limba);
        System.out.println("Numar cuvinte: "+numarCuvinte);
    }

    @Override
    public double calculPret(){
        return pret;
    }
}
