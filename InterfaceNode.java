package dadat1;

public interface InterfaceNode {
  
  /**
   * Agrega un rectangulo, y entrega false si produce un overflow, true en caso contrario
   * @param rect Rectangulo a agregar
   * @return false si produce un overflow, true si no
   */
  boolean addRectangle(Rectangle rect);
  
  /**
   * Diferencia entre el area del MBR de this y rect, y el area de rect
   * @param rect Rectangulo que se agregaria
   * @return Area expandida
   */
  double findExpansion(Rectangle rect);
}
