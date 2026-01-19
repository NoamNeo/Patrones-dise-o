package FactoryMethod.Products;

public class Charmander extends Pokemon {
  public Charmander() {
    this.nombre = "Charmander";
    this.naturaleza = "Firme";
    this.ataque = 25;
  }

  public void imprimir() {
    System.out.printf("Pokemon: %s\nNaturaleza: %s\nAtaque: %,d\n", this.nombre, this.naturaleza, this.ataque);
  }
}
