package at.fhtw.lpa;

public abstract class Roboter {
    protected String name;
    protected int weight;
    protected int stepLength;

    public Roboter() {
    }

    public Roboter(String name, int weight, int stepLength) {
        this.name = name;
        this.weight = weight;
        this.stepLength = stepLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStepLength() {
        return stepLength;
    }

    public void setStepLength(int stepLength) {
        this.stepLength = stepLength;
    }

    protected abstract String getRoboterType();

    public  void go(int numberOfSteps){
        int maxStepsWithoutBreak = 0;
        if (this.weight <= 5){
            maxStepsWithoutBreak = 20;
        } else if (this.weight > 5 && this.weight <= 10) {
            maxStepsWithoutBreak = 15;
        } else if (this.weight > 10 && this.weight <= 15) {
            maxStepsWithoutBreak = 10;
        } else if (this.weight > 15) {
            maxStepsWithoutBreak = 5;
        }

        if (numberOfSteps > maxStepsWithoutBreak){
            numberOfSteps = maxStepsWithoutBreak;
        }

        double distance = (numberOfSteps * getStepLength()) / 100.0f;
        System.out.println(getRoboterType() + " (" + this.name + ") geht " + distance + " Meter");
    }
}
