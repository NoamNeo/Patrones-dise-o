package Decorators;

public class CerdoDecorador extends DecoradorRecinto {
  public CerdoDecorador(Recinto recintoDecorado) {
    super(recintoDecorado);
  }

  @Override
  public String getAnimales() {
    return recintoDecorado.getAnimales() + "Cerdo\n";
  }

  @Override
  public int getCantidad() {
    return recintoDecorado.getCantidad() + 1;
  }
}
