package Decorators;

public class CerdoDecorador extends DecoradorRecinto {
  public CerdoDecorador(Recinto recintoDecorado) {
    super(recintoDecorado);
  }

  @Override
  public String[] getAnimales() {
    return super.putAnimales("Cerdo");
  }

  @Override
  public int getCantidad() {
    return recintoDecorado.getCantidad() + 1;
  }
}
