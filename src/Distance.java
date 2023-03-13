import Point.Point;
import java.util.*;

public class Distance {
    double getDistance(Point Ranger, Point Enemy) {
        return Math.sqrt(Math.pow(Ranger.getX() - Enemy.getX(), 2) + Math.pow(Ranger.getX() - Enemy.getX(), 2));
    }

    int getNearestEnemy(Point Bow, List<Ability> Team) {
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < Team.size(); i++) {
            if (min > getDistance(Bow, Team.get(i).getPoint()) && Team.get(i).getHealth()>0) {
                index = i;
                min = getDistance(Bow, Team.get(i).getPoint());

            }
        }
        return index;
    }
}