public class Revista extends Publicatie{
@Override
    public void afisareInformatii(){
    System.out.println("Tip publicatie: Revista");
}
@Override
    public void descriereContinut() {
    System.out.println("Revista contine articole si interviuri.");
}
}