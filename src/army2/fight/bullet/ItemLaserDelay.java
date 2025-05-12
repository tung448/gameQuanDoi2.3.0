package army2.fight.bullet;

import army2.fight.Bullet;
import army2.fight.BulletManager;
import army2.fight.Player;

public class ItemLaserDelay extends Bullet {

    public ItemLaserDelay(BulletManager bulletManager, byte id, int satThuong, Player pl, int X, int Y) {
        super(bulletManager, id, satThuong, pl, X, Y, 0, 0, 0, 0);
    }

    @Override
    public void nextXY() {
        super.nextXY();
    }

}
