package army2.fight.bullet;

import army2.fight.Bullet;
import army2.fight.BulletManager;
import army2.fight.MapEntry;
import army2.fight.Player;

public class ItemToNhen extends Bullet {

    public ItemToNhen(BulletManager bulletManager, byte bullId, int satThuong, Player pl, int X, int Y, int vx, int vy,
            int msg, int g100) {
        super(bulletManager, bullId, satThuong, pl, X, Y, vx, vy, msg, g100);
    }

    @Override
    public void nextXY() {
        super.nextXY();
        if (super.collect) {
            this.fm.mapMNG.addEntry(new MapEntry(this.bulletManager.mangNhenId++, (short) (X - 21), (short) (Y - 20),
                    MapEntry.mangNhenData, (short) MapEntry.mangNhenW, (short) MapEntry.mangNhenH, true));
        }
    }

}
