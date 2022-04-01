package gamers;

import main.Pair;
import main.Unit;

import java.util.concurrent.ThreadLocalRandom;

public class s24261 extends Unit {
    public s24261(final String id, final Pair position, final double rotate, final CollisionModel model) {
        super(id, position, rotate, model);
    }

    @Override
    public void run() {
        this.enableStopOnWall();
        this.enableMovement();
        this.forward();

        while (true) {
            try {
                this.robotControl();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void robotControl() throws InterruptedException {
        boolean randomBoolean = ThreadLocalRandom.current().nextBoolean();

        switch (whatIsInRange()) {
            case 0:
                if (randomBoolean) { rotateLeft(); }
                else { rotateRight(); }
                break;
            case 3:
                this.attackInNextMove();
                break;
            default:
                if (this.nearestCollision() <= 2 && nearestCollision() >= 0) {
                    this.stopGo();
                    Thread.sleep(1000);
                    this.getRandomAnglesToRotateBy(new int[]{-120, 120});
                    this.forward();
                }
                break;
        }
    }

    private void getRandomAnglesToRotateBy(int[] randomAngles) {
        int rnd = ThreadLocalRandom.current().nextInt(randomAngles.length);
        rotateBy(randomAngles[rnd]);
    }
}
