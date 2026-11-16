public class TestMain {
    public static void main(String[] args) {
        Manual m = new Manual("Anatomia corpului", "Popescu Adrian", 2024, 49.99, "Biologie", 200);
        m.afisareInformatii();
        System.out.println("Pret: " + m.calculPret());
    }
}
