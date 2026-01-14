package Decorators;

public class RecintoBase implements Recinto {
  private String nombre;
  private int area;
  private int capacidad;

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setArea(int area) {
    this.area = area;
  }

  public void setCapacidad(int capacidad) {
    this.capacidad = capacidad;
  }

  @Override
  public String getNombre() {
    return nombre;
  }

  @Override
  public int getArea() {
    return area;
  }

  @Override
  public int getCapacidad() {
    return capacidad;
  }
}
