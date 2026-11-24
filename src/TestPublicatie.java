public class TestPublicatie {
    public static void main(String[] args) {
        System.out.println("===MANUALE===");
        Manual m1 = new Manual();
        Manual m2 = new Manual("Matematica", "Andrei Popescu", 2023, 50.00, "Matematica", 200, "Liceu", "Art");
        Manual m3 = new Manual(m2);
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

        Roman r1 = new Roman();
        Roman r2 = new Roman("Baltagul", "Mihail Sadoveanu", 1930, 60.00, "Traditionalist", 250, "Cartea Romaneasca", "Cartonata");
        Roman r3 = new Roman(r2);
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
<<<<<<<HEAD

        System.out.println("\n===DICTIONARE===");
        Dictionar d1 = new Dictionar();
        Dictionar d2 = new Dictionar("DEX", "Academia Romana", 2021, 150.00, "Romana", 75000, "Explicativ", "Univers Enciclopedic", true, "Tiparit");
        Dictionar d3 = new Dictionar(d2);
        d1.setTitlu("Oxford English Dictionary");
        d1.setAutor("Oxford Press");
        d1.setAnAparitie(2020);
        d1.setPret(200.00);
        d1.setLimba("Engleza");
        d1.setNumarCuvinte(60000);
        d1.setTipDictionar("Bilingv");
        d1.setEditura("Oxford");
        d1.setEditieRevizuita(true);
        d1.setFormatDictionar("Digital");
        d1.afisareInformatii();
        System.out.println("---------");
        d2.afisareInformatii();
        System.out.println("---------");
        d3.afisareInformatii();

        System.out.println("\n===ENCICLOPEDII===");
        Enciclopedie e1 = new Enciclopedie();
        Enciclopedie e2 = new Enciclopedie("Enciclopedia Universala Britanica", "Britannica", 2018, 450.00, 10, "General", 25000, "Litera", true, "Adulti");
        Enciclopedie e3 = new Enciclopedie(e2);
        e1.setTitlu("Enciclopedia Animalelor");
        e1.setAutor("National Geographic");
        e1.setAnAparitie(2022);
        e1.setPret(120.00);
        e1.setNumarVolume(3);
        e1.setDomeniu("Zoologie");
        e1.setNumarArticole(1500);
        e1.setEditura("RAO");
        e1.setContinePlanseColor(true);
        e1.setGrupTinta("Copii");
        e1.afisareInformatii();
        System.out.println("---------");
        e2.afisareInformatii();
        System.out.println("---------");
        e3.afisareInformatii();

        System.out.println("\n===== TEST GETTERI =====");
        System.out.println("Limba dictionarului: " + d2.getLimba());
        System.out.println("Numar cuvinte dictionar: " + d2.getNumarCuvinte());
        System.out.println("Domeniul enciclopediei: " + e2.getDomeniu());
        System.out.println("Numar volume enciclopedie: " + e2.getNumarVolume());

        System.out.println("\n===== TEST CALCUL PRET =====");
        System.out.println("Pret de baza dictionar: " + d2.getPret() + " -> Pret calculat (* 0.5): " + d2.calculPret());
        System.out.println("Pret de baza enciclopedie: " + e2.getPret() + " -> Pret calculat (* 0.8): " + e2.calculPret());
=======
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



