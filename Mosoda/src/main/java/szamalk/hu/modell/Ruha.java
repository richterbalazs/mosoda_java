package szamalk.hu.modell;

public class Ruha {
    private String tulaj;
    private boolean tisztaE;

    public Ruha(String tulaj, boolean tisztaE) {
        this.tulaj = tulaj;
        this.tisztaE = tisztaE;
    }

    public String getTulaj() {
        return tulaj;
    }

    public boolean isTisztaE(){
        return tisztaE;
    }

    public void setTisztaE(boolean tisztaE) {
        this.tisztaE = tisztaE;
    }

    @Override
    public String toString() {
        return "Ruha{" +
                "tulaj='" + tulaj + '\'' +
                ", tisztaE=" + tisztaE +
                '}';
    }
}
