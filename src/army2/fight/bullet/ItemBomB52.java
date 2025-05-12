package army2.fight.bullet;

import army2.fight.Bullet;
import army2.fight.BulletManager;
import army2.fight.Player;

public class ItemBomB52 extends Bullet {

    public ItemBomB52(BulletManager bulletManager, byte bullId, int satThuong, Player pl, int X, int Y, int vx, int vy,
            int msg, int g100) {
        super(bulletManager, bullId, satThuong, pl, X, Y, vx, vy, msg, g100);
        super.isCanCollision = false;
    }

    @Override
    public void nextXY() {
        super.nextXY();
        if (super.collect) {
            this.bulletManager.addBullet(new B52Bullet(bulletManager, (byte) 3, this.satThuong, super.pl, this.X - 50,
                    this.Y - 260, 2, 0, 0, 80, this.X, this.Y));
        }
    }

}
