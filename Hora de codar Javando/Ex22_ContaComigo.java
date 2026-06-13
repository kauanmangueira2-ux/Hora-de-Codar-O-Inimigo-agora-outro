public class Ex22_ContaComigo {
    public static void main(String[] args) {
        int numero = 1;

        for (int grupo = 1; grupo <= 20; grupo++) {
            System.out.print("(" + grupo + ", ");

            for (int i = 0; i < 10; i++) {
                System.out.print(numero);
                numero++;

                if (i < 9) {
                    System.out.print(" ");
                }
            }

            System.out.println(")");
        }
    }
}
