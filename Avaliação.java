public class Avaliação {
    public static void main(String[] args) {

        int numero1 = 0, numero2 = 0, numero3 = 0, Idade1 = 0, idade2 = 0, idade3 = 0 , familia1 = 0, familia2 = 0, familia3 = 0;

        int m1 = numero1 + numero2 + numero3;
        int r1 = m1 / 3;
        int m2 = Idade1 - familia1 + idade2 - familia2 + idade3 - familia3;
        int m3 = familia1 + familia2 + familia3;
        int r2 = m2 / m3;

        System.out.println(r1);
        System.out.println(r2);

        }
}
