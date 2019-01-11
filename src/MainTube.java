/**
 * Created by pidho on 12.04.2018.
 */
public class MainTube implements InterfaceTube {
    public MainTube(){
        System.out.print("MainTube: Created\n");
    }

    @Override
    public String getPosition(){
        return "MainTube";
    }

    @Override
    public void update() {
        System.out.print("MainTube: Update\n");
    }

    @Override
    public void stop() {
        System.out.print("MainTube: Stop\n");
    }

    @Override
    public void reset() {
        System.out.print("MainTube: Reset\n");
    }

    @Override
    public void onRestart() {
        System.out.print("MainTube: onRestart\n");
    }

    @Override
    public void start(){
        System.out.print("MainTube: Start\n");
    }
}
