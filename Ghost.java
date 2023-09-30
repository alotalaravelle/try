package pokemon;
import java.util.Random;
    class Ghost extends Pokemon {
    private String total;
    public Ghost(String name, String type) {
        super(name, type);
    }

      public void SkillList() {
        System.out.println("1. Shadow claw ");
        System.out.println("2. HyperBeam");
        System.out.println("3. Thunder");
    }
    public void attack(String Skills) {
        System.out.println(type + " type Pokemon " + name + " used " + Skills + "!");  
        int Min = 0; 
        int Max = 20; 
        int damage = new Random().nextInt(Max - Min + 1) + Min;
        int total = damage + (totalt * 2);
        
        System.out.println("Damage: " + total);
    }

    public void train() {
        if (health > 0) {
            health -= 5;
            attack += 3;
            totalt++;
            System.out.println("Your Pokemon (attack) power increased.");
        } else {
            System.out.println("Your Pokemon is exhausted! \n Please let them rest!");
         System.out.println("Damage dealt: " + total);
        }
    }
}