public class TestMain {
    public static void main(String[] args) {
        Manual m = new Manual("Anatomia corpului", "Popescu Adrian", 2024, 49.99, "Biologie", 200);
        m.afisareInformatii();
        System.out.println("Pret: " + m.calculPret());

        // Testare Dictionar
        Publicatie dic = new Dictionar("Dictionarul explicativ al limbii romane", "Academia Romana", 2021, 150.0, "Romana", 75000);
        dic.afisareInformatii();
        System.out.println("Pret: " + dic.calculPret());

        // Testare Enciclopedie
        Publicatie enc = new Enciclopedie("Enciclopedia Unversala Britanica", "Enciclopedia", 2018, 450.0, 10, "General");
        enc.afisareInformatii();
        System.out.println("Pret: " + enc.calculPret());

        //Testare Revista
        Publicatie Rev = new Revista("National Geographic", "John Smith", 2025, 25.5, "Stiinta", "Lunara");
        Rev.afisareInformatii();
        System.out.println("Pret: " + Rev.calculPret());

        //Testare Ziar
        Publicatie Zi = new Ziar("Viata Libera Galati","Radu Macovei", 1989, 15, "speciala", "Galati");
        Zi.afisareInformatii();
        System.out.println("Pret: " + Zi.calculPret());
    }
}
