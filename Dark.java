package pokemon;
import java.util.Random;

    class Dark extends Pokemon {
    public Dark(String name, String type) {
        super(name, type);
    }

    public void SkillList() {
        System.out.println("1. Dark Void");
        System.out.println("2. Dark Pulse");
        System.out.println("3. Bad Dreams");
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
            health -= 10;
            attack += 4;
            totalt++;
            System.out.println("Your Pokemon (attack) power increased.");
        } else {
            System.out.println("Your Pokemon is exhausted! \n Please let them est!");
        }
    }
}