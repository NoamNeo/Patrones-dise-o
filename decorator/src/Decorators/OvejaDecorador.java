package Decorators;

public class OvejaDecorador extends DecoradorRecinto {
  public OvejaDecorador(Recinto recintoDecorado) {
    super(recintoDecorado);
  }

  @Override
  public String getAnimales() {
    return recintoDecorado.getAnimales() + "Oveja\n";
  }

  @Override
  public int getCantidad() {
    return recintoDecorado.getCantidad() + 1;
  }
}
