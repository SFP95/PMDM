package srcNew.Split;

public class EjSplit {
    private static String text="Alba-Jessica-Carols-David-Marcelo-Gavi-Fouad-Rafa-Maria";

    public static void main(String[] args) {
        dividir();
    }

    private static void dividir() {
        System.out.println(text.split("-"));
    }
}
