package szamalk.hu.modell;

import java.util.ArrayList;
import java.util.List;

public class Mosoda {
    private Ruha[] ruhak;


    public Mosoda(Ruha[] ruhak) {
        this.ruhak = ruhak;
    }

    public Mosoda(int db) {
        ruhak = new Ruha[db];

    }

    public void bevesz(Ruha ruha){
        for (int i = 0; i < ruhak.length; i++) {
            if (ruhak[i] == null) {
                ruhak[i] = ruha;
                return;
            }
        }
        System.out.println("Sikeresen bevetted a ruhát a mosodába!");
    }

    public void kiad(String tulajdonos){
        for (int i = 0; i < ruhak.length; i++){
            if(ruhak[i] != null && ruhak[i].getTulaj().equals(tulajdonos)){
                System.out.println("A következő ruha sikeresen kiadásra került: " + ruhak[i]);
                ruhak[i] = null;
                return;
            }
        }
    }

    public void mos(){

    }
}
