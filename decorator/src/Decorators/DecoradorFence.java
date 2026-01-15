package Decorators;

public class DecoradorFence extends DecoradorRecinto {

  public DecoradorFence(Recinto recintoDecorado) {
    super(recintoDecorado);
  }

  public void setNombre(String nombre) {
    recintoDecorado.setNombre(nombre);
  }

  public void setArea(int area) {
    recintoDecorado.setArea(area);
  }

  public void setCapacidad(int capacidad) {
    recintoDecorado.setCapacidad(capacidad);
  }

  @Override
  public String getNombre() {
    return recintoDecorado.getNombre() + "+";
  }

  @Override
  public int getArea() {
    return recintoDecorado.getArea() + 5;
  }

  @Override
  public int getCapacidad() {
    return recintoDecorado.getCapacidad() + 10;
  }
}
