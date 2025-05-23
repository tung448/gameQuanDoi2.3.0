package army2.fight.bullet;

import army2.fight.Bullet;
import army2.fight.BulletManager;
import army2.fight.Player;
import army2.fight.boss.BigBoom;

public class BigBoomBum extends Bullet {

    public BigBoomBum(BulletManager bulletManager, byte bullId, int satThuong, Player pl) {
        super(bulletManager, bullId, satThuong, pl, pl.X, pl.Y - 12, 0, 0, 0, 0);
    }

    @Override
    public void nextXY() {
        this.collect = true;
        this.XArray.add((short) X);
        this.YArray.add((short) Y);
        this.Y += 2;
        this.XArray.add((short) X);
        this.YArray.add((short) Y);
        ((BigBoom) pl).bomAction();
        if (this.isCanCollision) {
            fm.mapMNG.collision(X, Y, this);
        }
    }

}
