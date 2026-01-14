import Decorators.*;

public class Granja {
  public static void print(Recinto recinto) {
    System.out.printf("Recinto: %s\n", recinto.getNombre());
    System.out.printf("Capacidad: %,d\n", recinto.getCapacidad());
    System.out.printf("Area: %,d\n", recinto.getArea());
  }

  public static void main(String[] args) {
    Recinto recinto = new RecintoBase();
    recinto.setNombre("Mi recinto");
    recinto.setArea(20);
    recinto.setCapacidad(10);
    print(recinto);
    recinto = new DecoradorFence(recinto);
    print(recinto);
    recinto = new DecoradorSize(recinto);
    print(recinto);
    recinto = new DecoradorCamara(recinto);
    print(recinto);
  }
}
