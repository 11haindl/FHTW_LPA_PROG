package at.fhtw.lpa;

import java.util.Date;

public class PushUp extends BasicWorkout{
    private int repetitions;

    public PushUp(Date date, int repetitions) throws IllegalArgumentException{
        super(date, 1);
        if (repetitions > 0){
            this.repetitions = repetitions;
        } else {
            throw new IllegalArgumentException("Repetitions has to be greater than 0");
        }
    }

    @Override
    public int getIntensity() {
        if(this.repetitions < 10){
            return this.repetitions;
        } else {
            return 10;
        }
    }

    @Override
    public int getEnergy() {
        return 5 * repetitions;
    }

    @Override
    public String toString() {
        return String.format("%s: %s \"%s\" %dkcal %d repetitions",
                date, getIntensityString(), getDescription(),  getEnergy(), repetitions);
    }
}
