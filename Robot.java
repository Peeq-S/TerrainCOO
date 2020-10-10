public class Robot {
    private String nom;
    private IDeplacement deplacement;
    private float position;

    public Robot(String nom, IDeplacement deplacement) {
        this.nom = nom;
        this.deplacement = deplacement;
        this.position = 0;
    }
    
    public void deplacement(Iterrain t){
        if(t.estAccidente(position)){
            this.avancer(this.deplacement.getVitesseAcc());
        } else {
            this.avancer(this.deplacement.getVitesse());
        }
    }

    public float getPosition() {
        return position;
    }

    private void avancer(float vitesse) {
        this.position += vitesse;
    }

    public String getNom() {
        return nom;
    }

}
