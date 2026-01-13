package Decorators;

import java.util.Arrays;

public abstract class DecoradorRecinto implements Recinto {
  protected Recinto recintoDecorado;

  public String[] putAnimales(String animal) {
    int length = (recintoDecorado.getAnimales().length == 0) ? 1 : recintoDecorado.getAnimales().length + 1;
    String[] newArray = Arrays.copyOf(recintoDecorado.getAnimales(), length);
    newArray[length] = animal;
    return newArray;
  }

  public DecoradorRecinto(Recinto recintoDecorado) {
    this.recintoDecorado = recintoDecorado;
  }

  @Override
  public String[] getAnimales() {
    return recintoDecorado.getAnimales();
  }

  @Override
  public int getCantidad() {
    return recintoDecorado.getCantidad();
  }
}
