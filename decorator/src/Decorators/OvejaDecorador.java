package Decorators;

public class OvejaDecorador extends DecoradorRecinto {
  public OvejaDecorador(Recinto recintoDecorado) {
    super(recintoDecorado);
  }

  @Override
  public String[] getAnimales() {
    return super.putAnimales("Oveja");
  }

  @Override
  public int getCantidad() {
    return recintoDecorado.getCantidad() + 1;
  }
}
