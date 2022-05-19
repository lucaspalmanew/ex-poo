package ex03;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

public Guerreiro (String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
    super(nome, vida, mana, xp, inteligencia, forca, level);
    }

private List<String> habilidade;
    public List<String> getHabilidade() {
        return habilidade;
    }
    
public void setHabilidade(List<String> habilidade) {
    this.habilidade = habilidade;
    }

@Override
public void lvlUp() {
    this.getForca();
    this.getVida();
    this.getLevel();
    System.out.println("|GUERREIRO|");
    System.out.println("----------------------------------------------");
    System.out.println("Força: " + getForca() + 1);
    System.out.println("Vida: " + getLevel() + 1);
    System.out.println("Level: " + getLevel());
    
    }

@Override
public int attack() {
    Random random = new Random();
    int var = (this.getForca() * this.getLevel()) + random.nextInt(301);
    return var;
    } 
    

public void aprenderHabilidade (String habilidade ) {
   	 
    }

}