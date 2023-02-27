import java.util.Random;
public class Spearman extends Ability{
    final Random random = new Random();
    Spearman(String Imya){
        setHealth(10);
        setArmor(5);
        setArrow(0);
        setDamage(random.nextInt(8,10));
        setAttack(4);
        setDelivery(0);
        setSpeed(4);
        setWizzard(0);
        Name = Imya;
        Info = "Да, я человек с копьем";
    }
}

