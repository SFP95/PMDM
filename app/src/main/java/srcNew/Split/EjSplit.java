package srcNew.Split;

public class EjSplit {
    private static String text="Alba-Jessica-Carols-David-Marcelo-Gavi-Fouad-Rafa-Maria";

    public static void main(String[] args) {
        dividir();
    }

    private static void dividir() {
        String[] palabra= text.split("-");
        for(int i =0;i<palabra.length;i++){
            System.out.println(i+" "+ palabra[i]);
        }

    }
}
