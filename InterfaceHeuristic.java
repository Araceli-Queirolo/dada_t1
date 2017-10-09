package dadat1;

public interface InterfaceHeuristic {
  
  /**
   * Divide un nodo en dos segun su heuristica
   * @param node Nodo con overflow
   * @param rect Rectangulo que causa el overflow
   * @param m Minimo de rectangulos
   * @param M Maximo de rectangulos
   * @return Un arreglo con dos nodos correctos
   */
  public Node[] splitNodeLeaf(NodeLeaf node, Rectangle rect, int m, int M);
}