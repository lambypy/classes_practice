public class Spaceship {
    String name;
    SpaceshipSize size;
    Armaments armaments;
    String allegance;
    int numOfCrew;
    boolean hyperdriveActive;
    String owner;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpaceshipSize getSize() {
        return size;
    }

    public Armaments getArmaments() {
        return armaments;
    }

    public void setArmaments(Armaments armaments) {
        this.armaments = armaments;
    }

    public String getAllegance() {
        return allegance;
    }

    public void setAllegance(String allegance) {
        this.allegance = allegance;
    }

    public int getNumOfCrew() {
        return numOfCrew;
    }

    public void setNumOfCrew(int numOfCrew) {
        this.numOfCrew = numOfCrew;
    }

    public boolean isHyperdriveActive() {
        return hyperdriveActive;
    }

    public void setHyperdriveActive(boolean hyperdriveActive) {
        this.hyperdriveActive = hyperdriveActive;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
