import java.util.Scanner;

/**
 * Created by pidho on 12.04.2018.
 */
public class Main {
    public static void main(String []args){
        Decorator tube = new Tube(new MainTube());
        Decorator mov_tube = new MovingTube(tube);
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Choose command:\n" +
                    "tube - call function update from Tube;\n" +
                    "moving tube - call function update from MovingTube;\n" +
                    "exit - end of program.\n");
            String choise = in.nextLine();
            if(choise.compareTo("tube")==0){
                tube.update();
            }else if(choise.compareTo("moving tube")==0){
                mov_tube.update();
            }else if(choise.compareTo("exit")==0){
                break;
            }else{
                System.out.print("Unknown parameter, try again.\n");
                continue;
            }

        }while (true);
    }
}
