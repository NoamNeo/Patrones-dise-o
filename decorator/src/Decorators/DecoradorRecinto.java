package Decorators;

public abstract class DecoradorRecinto implements Recinto {
  protected Recinto recintoDecorado;

  public DecoradorRecinto(Recinto recintoDecorado) {
    this.recintoDecorado = recintoDecorado;
  }

  @Override
  public String getAnimales() {
    return recintoDecorado.getAnimales();
  }

  @Override
  public int getCantidad() {
    return recintoDecorado.getCantidad();
  }
}
