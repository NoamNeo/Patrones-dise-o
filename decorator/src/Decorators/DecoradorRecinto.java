package Decorators;

public abstract class DecoradorRecinto implements Recinto {
  protected Recinto recintoDecorado;

  public DecoradorRecinto(Recinto recintoDecorado) {
    this.recintoDecorado = recintoDecorado;
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
