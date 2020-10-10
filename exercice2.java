public class exercice2 {
    public exercice2 () { }
    public static void main(String[] args) { 

        Robot r1 = new Robot("BB8", new Deplacement(5, 2));
        Robot r2 = new Robot("C3P0", new Deplacement(3, 3));
        Robot r3 = new Robot("Robot Licorne", new Deplacement(50, 100));


        Iterrain t = new Terrain(12.3f);

        do { 
            r1.deplacement(t); 
            r2.deplacement(t); 
            r3.deplacement(t); } 
        while (
              r1.getPosition()<t.getFin() 
            &&r2.getPosition()<t.getFin()
            &&r3.getPosition()<t.getFin()); 
        
        Robot gagnant;
        if(r1.getPosition()>t.getFin()){
            gagnant = r1;
        } else if(r2.getPosition()>t.getFin()){
            gagnant = r2;
        } else {
            gagnant = r3;
        }

        System.out.println(gagnant.getNom() +" a gagné la course de robot");
    }
}