package FactoryMethod.Creators;

import FactoryMethod.Products.*;

public class CreadorPikachu extends Creator {
  public Pokemon FactoryMethod() {
    return new Pikachu();
  }
}
