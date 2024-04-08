public class Television implements Appareil {
    private int son;
    private int chaine;
    private boolean allume;

    public void allumer() {
        this.allume = true;
    }

    public void eteindre() {
        this.allume = false;
    }

    public boolean isAllume() {
        return allume;
    }

    public String toString() {
        String res = "son : " + son + "\n";
        res += "chaine : " + chaine + "\n";
        res += "allume  : " + allume;
        return res;
    }
}
