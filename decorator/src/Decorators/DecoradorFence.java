package Decorators;

public class DecoradorFence extends DecoradorRecinto {

  public DecoradorFence(Recinto recintoDecorado) {
    super(recintoDecorado);
    recintoDecorado.setNombre(recintoDecorado.getNombre() + "+");
    recintoDecorado.setArea(recintoDecorado.getArea() + 5);
    recintoDecorado.setCapacidad(recintoDecorado.getCapacidad() + 10);
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
    return recintoDecorado.getNombre();
  }

  @Override
  public int getArea() {
    return recintoDecorado.getArea();
  }

  @Override
  public int getCapacidad() {
    return recintoDecorado.getCapacidad();
  }
}
