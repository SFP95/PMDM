package srcNew.EJ1.Clases;

public class Consumidor implements Productor{
    private String nombreCon;
    public String getNombreCon() {
        return nombreCon;
    }
    public void setNombreCon(String nombreCon) {
        this.nombreCon = nombreCon;
    }

    public static void generarEvento(String nomCon, String evento){
        System.out.println("Nombre del consumudor: "+ nomCon);
        System.out.println("Tipo de evento: "+ evento);
    }
}
