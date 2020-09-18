package problemFive;

import problemFive.*;
import java.util.Vector;

public class DragonLaunch {
    private Vector kidnapped = new Vector();

    public void kidnap(Person p) {
        kidnapped.add(p);
    }

    public boolean willDragoEatOrNot() {
        return kidnapped.size() > 0;
    }

    public static void main(String[] args) {
        
    }
}