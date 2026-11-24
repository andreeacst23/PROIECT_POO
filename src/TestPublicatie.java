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
//TESTARE REVISTA ZIAR

        System.out.println("=== REVISTE ===");

        Revista rev1 = new Revista();
        Revista rev2 = new Revista("National Geographic", "John Smith", 2023,
                25.00, "Stiinta", "Lunara", 100);
        Revista rev3 = new Revista(rev2);

        rev1.setTitlu("Stiinta si Tehnica");
        rev1.setAutor("Mihai Popescu");
        rev1.setAnAparitie(2024);
        rev1.setPret(20.00);
        rev1.setDomeniu("Tehnologie");
        rev1.setPeriodicitate("Saptamanala");
        rev1.setNumarPagini(80);

        rev1.afisareInformatii();
        System.out.println("-----------");
        rev2.afisareInformatii();
        System.out.println("-----------");
        rev3.afisareInformatii();

        System.out.println("\n=== ZIARE ===");

        Ziar z1 = new Ziar();
        Ziar z2 = new Ziar("Adevarul", "Redactia Adevarul", 2023,
                5.00, "Nationala", "Bucuresti", 20);
        Ziar z3 = new Ziar(z2);

        z1.setTitlu("Viata Libera");
        z1.setAutor("Redactia Viata Libera");
        z1.setAnAparitie(2024);
        z1.setPret(4.00);
        z1.setEditie("Locala");
        z1.setLocalitate("Galati");
        z1.setNumarPagini(16);

        z1.afisareInformatii();
        System.out.println("-----------");
        z2.afisareInformatii();
        System.out.println("-----------");
        z3.afisareInformatii();

        System.out.println("\n===== TEST GETTERI =====");

        System.out.println("Titlul revistei: " + rev2.getTitlu());
        System.out.println("Domeniul revistei: " + rev2.getDomeniu());
        System.out.println("Numarul de pagini: " + rev2.getNumarPagini());

        System.out.println("Titlul ziarului: " + z2.getTitlu());
        System.out.println("Localitatea ziarului: " + z2.getLocalitate());
        System.out.println("Pretul ziarului: " + z2.getPret());
    }
}



