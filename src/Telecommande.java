import java.util.*;

public class Telecommande {
    private List<Appareil> appareils;

    public Telecommande() {
        appareils = new ArrayList<>();
    }

    public void ajouterAppareil(Appareil appareil) {
        appareils.add(appareil);
    }

    public void allumerAppareil(int indiceAppareil) {
        appareils.get(indiceAppareil).allumer();
    }

    public void eteindreAppareil(int indiceAppareil) {
        appareils.get(indiceAppareil).eteindre();
    }

    public void activerTout() {
        for (Appareil appareil : appareils) {
            appareil.allumer();
        }
    }

    public void appuyer (int i) {
        if (appareils.get(i).isAllume()) {
            this.allumerAppareil(i);
        } else {
            this.eteindreAppareil(i);
        }
    }

    public String toString(){
        String res = "";
        for (int i = 0; i < appareils.size(); i++){
            res += "lampe numéro"+i+" "+ appareils.get(i).toString()+"\n";
        }
        return res;
    }
}
