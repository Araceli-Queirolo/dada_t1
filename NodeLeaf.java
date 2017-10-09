package dadat1;

public class NodeLeaf extends Node implements InterfaceNode{
  private Rectangle[] rectangle_array;
  int num_rects; //Rectangulos en rectangle_array
  
  /**
   * Constructor de un nodo hoja
   * @param m Minimo de rectangulos
   * @param M Maximo de rectangulos
   */
  public NodeLeaf(int m, int M) {
    this.isRoot = false;
    this.min = m;
    this.max = M;
    num_rects = 0;
    rectangle_array = new Rectangle[this.max];
    this.mbr = new Rectangle();
  }
  
  public boolean addRectangle(Rectangle rect) {
    if (num_rects < max) {
      this.mbr = mbr.surroundRect(rect);
      this.rectangle_array[num_rects] = rect;
      //falta actualizar el mbr
      return true;
    } 
    else
      return false;
  }
  
  /**
   * Entrega el rectangulo en la posicion i
   * @param i Posicion dentro del arreglo
   * @return Rectangulo en posicion i
   */
  public Rectangle showRectangle(int i) {
    return rectangle_array[i];
  }
  
  /**
   * Entrega el arreglo de rectangulos
   * @return Arreglo de rectangulos
   */
  public Rectangle[] giveRectangles() {
    return rectangle_array;
  }
}
