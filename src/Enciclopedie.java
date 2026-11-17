public class Enciclopedie extends Publicatie{
    private int numarVolume;
    private String domeniu;

    public Enciclopedie(String titlu, String autor, int anAparitie,double pret, int numarVolume, String domeniu){
        super(titlu,autor,anAparitie,pret);
        this.numarVolume=numarVolume;
        this.domeniu=domeniu;
    }

    @Override
    public void afisareInformatii(){
        System.out.println("Enciclopedie: " + titlu);
        System.out.println("Coordonator: "+autor);
        System.out.println("An aparitie: "+anAparitie);
        System.out.println("Domeniu: "+domeniu);
        System.out.println("Numar volume: "+numarVolume);
    }

    @Override
    public double calculPret(){
        return pret;
    }
}
