package at.fhtw.lpa;

public class Tom3000 extends Roboter implements SpeekingRoboter{

    public Tom3000() {
    }

    public Tom3000(String name, int weight, int stepLength) {
        super(name, weight, stepLength);
    }

    @Override
    protected String getRoboterType() {
        return "Tom3000";
    }

    @Override
    public void speek(String str) {
        System.out.println(str);
    }
}
