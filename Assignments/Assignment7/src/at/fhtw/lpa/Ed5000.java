package at.fhtw.lpa;

public class Ed5000 extends Roboter implements MusikRoboter{
    public Ed5000() {
    }

    public Ed5000(String name, int weight, int stepLength) {
        super(name, weight, stepLength);
    }

    @Override
    public void playMusik() {
        System.out.println("lalala");
    }

    @Override
    protected String getRoboterType() {
        return "Ed5000";
    }
}
