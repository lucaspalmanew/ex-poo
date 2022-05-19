package ex03;

public class Main {

    public static void main(String[] args) {
        Guerreiro g1 = new Guerreiro ("GUERREIRO", 100, 100, 5, 20, 7, 4);
        g1.lvlUp();
        System.out.println("Atack do guerreiro: " + g1.attack() + "\n");
        
        Mago m1 = new Mago ("MAGO", 100, 200, 10, 10, 5, 0);
        m1.lvlUp();
        System.out.println("Atack do mago: " + m1.attack());
    }
    
}