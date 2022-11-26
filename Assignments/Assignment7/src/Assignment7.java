import at.fhtw.lpa.*;

import java.util.ArrayList;
import java.util.List;

public class Assignment7 {
    public static void main(String[] args) {
        List<Roboter> roboters = createRoboterList();
        testRoboters(roboters);
    }

    public static List<Roboter> createRoboterList(){
        List<Roboter> roboters = new ArrayList<>();
        Tom3000 tom = new Tom3000("Thomas", 7, 30);
        Max2000 max = new Max2000("Maximilian", 4, 13);
        Ed5000 ed = new Ed5000("Eduard", 18, 53);
        roboters.add(tom);
        roboters.add(max);
        roboters.add(ed);
        return roboters;
    }

    public static void testRoboters(List<Roboter> roboters){
        for (Roboter roboter : roboters){
            roboter.go(50);
            if(roboter instanceof SpeekingRoboter){
                ((SpeekingRoboter) roboter).speek("Ich bin ein Sprechneder Roboter");
            }
            if (roboter instanceof MusikRoboter){
                ((MusikRoboter) roboter).playMusik();
            }
            System.out.println("---------------------------------------------------");
        }
    }
}
