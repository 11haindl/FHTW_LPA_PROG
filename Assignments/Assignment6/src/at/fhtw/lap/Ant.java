package at.fhtw.lap;

public class Ant extends Insect {
    private String functionInColony;
    private String species;

    public Ant() {
    }

    public Ant(String habitat, int age, String gender, String housing, int numberOfWings, String functionInColony, String species) {
        super(habitat, age, gender, housing, numberOfWings);
        this.functionInColony = functionInColony;
        this.species = species;
    }

    public String getFunctionInColony() {
        return functionInColony;
    }

    public void setFunctionInColony(String functionInColony) {
        this.functionInColony = functionInColony;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Ant{" +
                "functionInColony='" + functionInColony + '\'' +
                ", species='" + species + '\'' +
                ", housing='" + housing + '\'' +
                ", numberOfWings=" + numberOfWings +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
