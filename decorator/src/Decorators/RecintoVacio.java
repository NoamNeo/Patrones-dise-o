package Decorators;

public class RecintoVacio implements Recinto {
  @Override
  public String[] getAnimales() {
    return null; // Al estar vacío no hay animales
  }

  @Override
  public int getCantidad() {
    return 0; // Al no haber animales la cantidad es 0
  }
}
