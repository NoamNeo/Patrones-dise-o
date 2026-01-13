package Decorators;

public class VacaDecorador extends DecoradorRecinto {
  public VacaDecorador(Recinto recintoDecorado) {
    super(recintoDecorado);
  }

  @Override
  public String[] getAnimales() {
    return super.putAnimales("Vaca");
  }

  @Override
  public int getCantidad() {
    return recintoDecorado.getCantidad() + 1;
  }
}
