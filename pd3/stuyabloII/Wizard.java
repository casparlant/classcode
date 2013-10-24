
public class Wizard extends Character{
    private int mana;

    public Wizard(String name) {
	super(name);
	mana = 20;
    }

    public String toString() {
	return super.toString()+" the wise who has "+mana+" mana";
    }
}
