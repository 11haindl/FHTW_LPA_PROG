import at.fhtw.lpa.BasicWorkout;
import at.fhtw.lpa.PushUp;
import at.fhtw.lpa.Running;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BasicWorkout[] bw = getDemoData();

        System.out.println(meanIntensity(bw));

        System.out.println(totalEnergy(bw));

        print(bw);
    }

    public static BasicWorkout[] getDemoData(){
        return new BasicWorkout[] {
                new BasicWorkout(new Date(2018, 04, 1), 8200, 7, 1200, "Bike trip to Krems"),
                new BasicWorkout(new Date(2018, 05, 8), 1200, 5, 500, "Digging a hole"),
                new Running(new Date(2018, 05, 7), 3600, 12000, "Evening run from work to home"),
                new PushUp(new Date(2018, 05, 7), 5)
        };
    }

    private static double meanIntensity(BasicWorkout[] data){
        float sum = 0;
        for(int i = 0; i < data.length; i++){
            sum += data[i].getIntensity();
        }
        return sum / data.length;
    }

    public static void print(BasicWorkout[] data){
        for (int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
    }

    public static int totalEnergy(BasicWorkout[] data){
        int totalEnergy = 0;
        for (int i = 0; i < data.length; i++){
            totalEnergy += data[i].getEnergy();
        }
        return totalEnergy;
    }
}
