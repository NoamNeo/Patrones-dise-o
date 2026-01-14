package Decorators;

public class DecoradorCamara extends DecoradorRecinto {

  public DecoradorCamara(Recinto recintoDecorado) {
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
    return recintoDecorado.getNombre() + " Con cámara";
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
