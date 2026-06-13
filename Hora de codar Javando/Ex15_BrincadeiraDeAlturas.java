public class Ex15_BrincadeiraDeAlturas {
    public static void main(String[] args) {
        double alturaAnacleto = 1.50;
        double alturaFelisberto = 1.10;

        int anos = 0;

        while (alturaFelisberto <= alturaAnacleto) {
            alturaAnacleto = alturaAnacleto + 0.02;
            alturaFelisberto = alturaFelisberto + 0.03;
            anos++;
        }

        System.out.println("Felisberto sera maior que Anacleto em " + anos + " anos.");
        System.out.printf("Altura de Anacleto: %.2f m%n", alturaAnacleto);
        System.out.printf("Altura de Felisberto: %.2f m%n", alturaFelisberto);
    }
}
