package srcNew.EJ1;

import srcNew.EJ1.Clases.Consumidor;
import srcNew.EJ1.Clases.Productor;

public class Ej1_1 {
    public static void main(String[] args) {
        //Ej1

        Consumidor c1=new Consumidor("Pepe","ComiCon");
        Consumidor c2=new Consumidor("Laura","Gamergy");
        Consumidor c3=new Consumidor("Silvia","JapanWeekend");
        System.out.println(c1.GenerarEvento());
        System.out.println(c2.GenerarEvento());
        System.out.println(c2.GenerarEvento());
    }
}
