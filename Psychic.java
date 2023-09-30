package pokemon;
import java.util.Random;

class Psychic extends Pokemon {
    public Psychic(String name, String type) {
        super(name, type);
    }

    public void SkillList() {
        System.out.println("1. Psybeam ");
        System.out.println("2. Shadowball");
        System.out.println("3. Psychic");
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
            health -= 7;
            attack += 5;
            totalt++;
            System.out.println("Your Pokemon (attack) power increased.");
        } else {
            System.out.println("Your Pokemon is exhausted! \n Please let them rest!");
        }
    }
}
