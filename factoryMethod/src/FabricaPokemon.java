import FactoryMethod.Products.*;
import FactoryMethod.Creators.*;

public class FabricaPokemon {
  public static void main(String[] args) {
    Creator creadorPikachu = new CreadorPikachu();
    Pokemon pikachu = creadorPikachu.FactoryMethod();
    pikachu.imprimir();
    Creator creadorCharmander = new CreadorCharmander();
    Pokemon charmander = creadorCharmander.FactoryMethod();
    charmander.imprimir();
  }
}
