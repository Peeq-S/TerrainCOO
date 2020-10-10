
public class Terrain implements Iterrain {

  private float fin;

  public Terrain (float fin) {
    this.fin = fin;
  };

  /**
   * Get the value of fin
   * @return the value of fin
   */
  public float getFin () {
    return fin;
  }

  /**
   * @return       Boolean
   * @param        position
   */
  public Boolean estAccidente(float position)
  {
    Boolean estA = false;
    if (position > fin/2)
      estA = true;
    return estA;
  }


}
