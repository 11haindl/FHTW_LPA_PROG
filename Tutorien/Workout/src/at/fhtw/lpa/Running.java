package at.fhtw.lpa;

import java.util.Date;

public class Running extends BasicWorkout{
    private int distance;

    public Running(Date date, int duration, int distance, String description){
        super(date, duration, 1, 1, description);
        this.distance = distance;
    }

    public Running(Date date, int duration, int intensity, int energy, String description, int distance) {
        super(date, duration, intensity, energy, description);
        this.distance = distance;
    }

    @Override
    public int getIntensity() {
        float pace = convertDurationToMinutes() / convertDistanceToKM();
        if (pace < 3){
            return 10;
        }
        if (pace < 4){
            return 9;
        }
        if (pace < 5){
            return 8;
        }
        if (pace < 6){
            return 7;
        }
        if (pace < 7){
            return 6;
        }
        if (pace < 8){
            return 5;
        }
        if (pace < 9){
            return 4;
        }
        if (pace < 10){
            return 3;
        }
        if (pace < 11){
            return 2;
        }else{
            return 1;
        }
    }

    private float convertDistanceToKM(){
        return this.distance / 1000.0f;
    }

    private float convertDurationToMinutes(){
        return  this.duration / 60.0f;
    }

    @Override
    public int getEnergy() {
        return getIntensity() * 100 * (int) convertDurationToMinutes() / 60;
    }

    @Override
    public String toString() {
        return String.format("%s: %s \"%s\" %.1fh, %dkcal %.1fkm",
                date, getIntensityString(), getDescription(), duration/3600., getEnergy(), convertDistanceToKM());
    }
}
