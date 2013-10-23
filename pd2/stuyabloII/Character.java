public class Character {
   
    protected String name;
    private int health;

    public Character() {
	name = "Unnamed Character";
    }

    public String toString() {
	return name;
    }

    public String attack() {
	return "Generic attack";
    }


}
