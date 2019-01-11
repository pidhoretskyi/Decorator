/**
 * Created by pidho on 12.04.2018.
 */
public abstract class Decorator implements InterfaceTube{
    protected InterfaceTube tube;

    public Decorator(InterfaceTube tube){
        this.tube = tube;
    }

    @Override
    public String getPosition() {
        return this.tube.getPosition();
    }

    @Override
    public void update() {
        this.tube.update();
    }

    @Override
    public void stop() {
        this.tube.stop();
    }

    @Override
    public void reset() {
        this.tube.reset();
    }

    @Override
    public void onRestart() {
        this.tube.onRestart();
    }

    @Override
    public void start() {
        this.tube.start();
    }
}
