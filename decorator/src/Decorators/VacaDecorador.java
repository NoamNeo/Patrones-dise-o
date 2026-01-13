package Decorators;

public class VacaDecorador extends DecoradorRecinto {
  public VacaDecorador(Recinto recintoDecorado) {
    super(recintoDecorado);
  }

  @Override
  public String getAnimales() {
    return recintoDecorado.getAnimales() + "Vaca\n";
  }

  @Override
  public int getCantidad() {
    return recintoDecorado.getCantidad() + 1;
  }
}
