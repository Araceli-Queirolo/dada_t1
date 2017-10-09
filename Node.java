package dadat1;

public abstract class Node implements InterfaceNode{
  protected boolean isRoot; // Indica si es raiz o no
  protected int min; // Minimo de rectangulos
  protected int max; // Maximo de rectangulos
  protected Rectangle mbr; // Minimum Bounding Rectangle 

  public double findExpansion(Rectangle rect) {
    Rectangle surr_rect = mbr.surroundRect(rect);
    double expand_area = surr_rect.giveArea() - this.mbr.giveArea();
    return expand_area;
  }
  
}
