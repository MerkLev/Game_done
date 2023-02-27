import java.util.Random;
public class Wizzard extends Ability{
    final Random random = new Random();
    Wizzard(String Imya){
        setHealth(30);
        setArmor(12);
        setArrow(0);
        setDamage(random.nextInt(2,5));
        setAttack(17);
        setDelivery(0);
        setSpeed(8);
        setWizzard(1);
        Name = Imya;
        Info = "Главный фокусник";
    }
}

