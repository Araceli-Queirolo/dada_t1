package dadat1;

public class Rectangle {
  boolean defined; // Si el rectangulo esta definido o no
  // Coordenadas
  double x1;
  double x2;
  double y1;
  double y2;
  
  /**
   * Constructor de un rectangulo por default
   */
  public Rectangle() {
    this.defined = false;
  }
  
  /**
   * Construtor de un rectangulo
   * @param x1 Coordenada
   * @param x2 Coordenada
   * @param y1 Coordenada
   * @param y2 Coordenada
   */
  public Rectangle(double x1, double x2, double y1, double y2) {
    this.defined = true;
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
  }
  
  /**
   * Entrega el MBR de this y rect
   * @param rect Rectangulo que se agregaria
   * @return MBR
   */
  public Rectangle surroundRect(Rectangle rect) {
    if (!this.defined) {
      return rect;
    }
    double rx1, rx2, ry1, ry2;
    rx1 = Math.min(this.x1, rect.x1);
    rx2 = Math.max(this.x2, rect.x2);
    ry1 = Math.min(this.y1, rect.y1);
    ry2 = Math.max(this.y2, rect.y2);
    Rectangle res = new Rectangle(rx1, rx2, ry1, ry2);
    return res;
  }
  
  /**
   * Entrega el area del rectangulo
   * @return Area
   */
  public double giveArea() {
    double res = (x2-x1)*(y2-y1);
    return res;
  }
  
  /**
   * Para agregar un rectangulo
   * @param r Rectangulo a agregar dentro de.
   * @return Nuevo rectangulo resultante
   */
  public Rectangle add(Rectangle r){
    return new Rectangle(Math.min(x1, r.x1), Math.min(y1, r.y1), Math.max(x2, r.x2), Math.max(y2, r.y2));
  }
  
}
