/**
 * Created by pidho on 12.04.2018.
 */
public class Tube extends Decorator{

    public Tube(InterfaceTube tube){
        super(tube);
    }

    @Override
    public void update(){
        System.out.print("Tube is moving left.\n");
        super.update();
    }
}
