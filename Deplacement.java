public class Deplacement implements IDeplacement{

    private int vitesse;
    private int vitesseAcc;

    public Deplacement(int normal, int accident) {
        this.vitesse = normal;
        this.vitesseAcc = accident;
    }

    public int getVitesse() {
        return vitesse;
    }

    public int getVitesseAcc() {
        return vitesseAcc;
    }
}
