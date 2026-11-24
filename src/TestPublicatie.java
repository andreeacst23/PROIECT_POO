public class TestPublicatie {
    public static void main(String[] args) {
        System.out.println("===MANUALE===");
        Manual m1=new Manual();
        Manual m2= new Manual("Matematica","Andrei Popescu",2023,50.00,"Matematica",200,"Liceu","Art");
       Manual m3=new Manual(m2);
       m1.setTitlu("Informatica");
       m1.setAutor("Maria Ionescu");
       m1.setAnAparitie(2021);
       m1.setPret(35.00);
       m1.setNrPagini(178);
       m1.setNivelStudiu("Gimnaziu");
       m1.setEditura("Corint");

        m1.afisareInformatii();
        System.out.println("-----------");
        m2.afisareInformatii();
        System.out.println("-----------");
        m3.afisareInformatii();
        System.out.println("\n===ROMANE===");

        Roman r1=new Roman();
        Roman r2=new Roman("Baltagul","Mihail Sadoveanu",1930,60.00,"Traditionalist",250,"Cartea Romaneasca","Cartonata");
        Roman r3=new Roman(r2);
        r1.setTitlu("Morometii");
        r1.setAutor("Marin Preda");
        r1.setAnAparitie(1955);
        r1.setPret(60.00);
        r1.setGenLiterar("Realist");
        r1.setNrPagini(500);
        r1.setEditura("Cartea Romaneasca");
        r1.setTipCoperta("Cartonata");
        r1.afisareInformatii();
        System.out.println("---------");
        r2.afisareInformatii();
        System.out.println("---------");
        r3.afisareInformatii();
        System.out.println("\n===== TEST GETTERI =====");

        System.out.println("Titlul manualului: " + m2.getTitlu());

        System.out.println("Autorul romanului: " + r2.getAutor());

        System.out.println("Pretul romanului: " + r2.getPret());
    }
}



