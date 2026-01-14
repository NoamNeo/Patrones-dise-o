package Decorators;

public class DecoradorSize extends DecoradorRecinto {

  public DecoradorSize(Recinto recintoDecorado) {
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
    return recintoDecorado.getArea() + 10;
  }

  @Override
  public int getCapacidad() {
    return recintoDecorado.getCapacidad() + 5;
  }
}
