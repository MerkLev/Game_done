import java.util.Random;
public class Monk extends Ability{
    final Random random = new Random();
    Monk(String Imya){
        setHealth(30);
        setArmor(7);
        setArrow(0);
        setDamage(random.nextInt(2,4));
        setAttack(12);
        setDelivery(0);
        setSpeed(5);
        setWizzard(1);
        Name = Imya;
        Info = "Даже лучше Будды";
    }
}
