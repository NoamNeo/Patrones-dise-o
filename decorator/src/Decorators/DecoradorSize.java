package Decorators;

public class DecoradorSize extends DecoradorRecinto {

  public DecoradorSize(Recinto recintoDecorado) {
    super(recintoDecorado);
    recintoDecorado.setNombre(recintoDecorado.getNombre() + "+");
    recintoDecorado.setArea(recintoDecorado.getArea() + 10);
    recintoDecorado.setCapacidad(recintoDecorado.getCapacidad() + 5);
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
