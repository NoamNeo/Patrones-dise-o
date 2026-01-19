package FactoryMethod.Products;

public class Pikachu extends Pokemon {
  public Pikachu() {
    this.ataque = 30;
    this.nombre = "Pikachu";
    this.naturaleza = "Timida";
  }

  public void imprimir() {
    System.out.printf("Pokemon: %s\nNaturaleza: %s\nAtaque: %,d\n", this.nombre, this.naturaleza, this.ataque);
  }
}
