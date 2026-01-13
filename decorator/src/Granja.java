import Decorators.*;

public class Granja {
  public static void print(Recinto recinto) {
    System.out.println("Animales en el recinto:");
    if (recinto.getCantidad() > 0) {
      for (int iterador = 0; iterador < recinto.getAnimales().length; iterador++) {
        System.out.println(recinto.getAnimales()[iterador]);
      }
    }
    System.out.printf("Cantidad total de animales: %,d\n", recinto.getCantidad());
  }

  public static void main(String[] args) {
    Recinto recinto = new RecintoVacio();
    print(recinto);
    recinto = new OvejaDecorador(recinto);
    print(recinto);
    recinto = new VacaDecorador(recinto);
    print(recinto);
  }
}
