package szamalk.hu;

import szamalk.hu.modell.Mosoda;
import szamalk.hu.modell.Ruha;

public class Program {
    public static void main(String[] args) {
        Mosoda mosoda = new Mosoda(5);

        Ruha ruha1 = new Ruha("János", false);
        Ruha ruha2 = new Ruha("Pista", true);
        Ruha ruha3 = new Ruha("Géza", false);
        Ruha ruha4 = new Ruha("Béla", false);
        Ruha ruha5 = new Ruha("Béci", true);
    }


}