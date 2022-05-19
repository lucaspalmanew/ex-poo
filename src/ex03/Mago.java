package ex03;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
    
public Mago (String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
    super(nome, vida, mana, xp, inteligencia, forca, level);
    }

private List<String> magia;

public List<String> getMagia() {
    return magia;
    }

public void setMagia(List<String> magia) {
    this.magia = magia;
    }

@Override
public void lvlUp() {
    this.getMana();
    this.getInteligencia();
    this.getLevel();
    System.out.println("|MAGO|");
    System.out.println("----------------------------------------------");
    System.out.println("Mana: " + getMana() + 1);
    System.out.println("Inteligência: " + getInteligencia() + 1);
    System.out.println("Level: " + getLevel());
    
    }

@Override
public int attack() {
    Random random = new Random();
    int var = (this.getInteligencia() * this.getLevel()) + random.nextInt(301);
        return var;
}

public void aprenderMagia (String magia ) {
    
}
}