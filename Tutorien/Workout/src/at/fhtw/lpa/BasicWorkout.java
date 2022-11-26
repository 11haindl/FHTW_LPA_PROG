package at.fhtw.lpa;

import java.util.Date;

public class BasicWorkout {
    protected int duration;
    protected  int intensity;
    protected  int energy;
    protected Date date;
    protected String description;

    public BasicWorkout(Date date, int duration) throws IllegalArgumentException {
        this.date = date;
        if (duration > 0){
            this.duration = duration;
        } else {
            throw new IllegalArgumentException("Duration has to be greater than 0");
        }
    }

    public BasicWorkout(Date date, int duration, int intensity) throws IllegalArgumentException {
        this(date, duration);
        if (intensity >= 1 && intensity <= 10) {
            this.intensity = intensity;
        } else {
            throw new IllegalArgumentException("Intensity must be in between 1 and 10");
        }
    }

    public BasicWorkout(Date date, int duration, int intensity, int energy) throws IllegalArgumentException{
        this(date, duration, intensity);
        {
            if (energy > 0){
                this.energy = energy;
            }else {
                throw new IllegalArgumentException("Energy has to be greater than 0");
            }
        }
    }

    public BasicWorkout(Date date, int duration, int intensity, int energy, String description) throws IllegalArgumentException{
        this(date, duration, intensity, energy);
        this.description = (description == null) ? null : String.format("%.100s", description);
    }


    public BasicWorkout(BasicWorkout bw){
        this(bw.date, bw.duration, bw.intensity, bw.energy, bw.description);
    }

    @Override
    public String toString() {
        return String.format("%s: %s \"%s\" %.1fh, %dkcal ",
                date, getIntensityString(), getDescription(), duration/3600., getEnergy());
    }

    public int getIntensity() {
        return intensity;
    }

    public int getEnergy() {
        return energy;
    }

    public String getDescription() {
        if (this.description == null){
            return "<no description>";
        }
        if(this.description.equals("")){
            return "<no description>";
        }else{
            return description;
        }
    }

    public final String getIntensityString(){
        String result = "[";
        for (int i = 0; i < 10; i++){
            if(i < getIntensity()){
                result = result.concat("*");
            } else {
                result = result.concat(" ");
            }
        }
        return result + "]";
    }
}
