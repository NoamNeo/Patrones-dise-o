package FactoryMethod.Creators;

import FactoryMethod.Products.*;

public class CreadorCharmander extends Creator {
  public Pokemon FactoryMethod() {
    return new Charmander();
  }
}
