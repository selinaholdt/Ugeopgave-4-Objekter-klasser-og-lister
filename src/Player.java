public class Player {
    String name;
    int skillLevel;

    public Player(String name, int skillLevel) {
        this.name = name;
        this.skillLevel = skillLevel;
    }

    public String toString() {
        return name + " (skill: " + skillLevel + ")";
    }
}
