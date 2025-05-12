package army2.fight.bullet;

import army2.fight.Bullet;
import army2.fight.BulletManager;
import army2.fight.BulletManager.VoiRong;
import army2.fight.Player;

public class ItemVoiRong extends Bullet {

    public ItemVoiRong(BulletManager bulletManager, byte bullId, int satThuong, Player pl, int X, int Y, int vx, int vy,
            int msg, int g100) {
        super(bulletManager, bullId, satThuong, pl, X, Y, vx, vy, msg, g100);
        super.isCanCollision = false;
    }

    @Override
    public void nextXY() {
        super.nextXY();
        if (super.collect) {
            this.bulletManager.hasVoiRong = true;
            this.bulletManager.voiRongs.add(new VoiRong(X, Y, 3));
        }
    }

}
