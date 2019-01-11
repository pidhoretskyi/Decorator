/**
 * Created by pidho on 12.04.2018.
 */
public class MovingTube  extends Decorator{
    public MovingTube(InterfaceTube tube){
        super(tube);
    }

    @Override
    public void update(){
        System.out.print("Tube is moving up/down\n");
        super.update();
    }
}
