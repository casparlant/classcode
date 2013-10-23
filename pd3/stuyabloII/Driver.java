
public class Driver{
    public static void main(String[] args) {
	Character c = new Character();
	Warrior w = new Warrior();
	Wizard wi = new Wizard();

	System.out.println(c);
	System.out.println(c.attack());
	System.out.println();

	System.out.println(w);
	System.out.println(w.attack());
	System.out.println();

	System.out.println(wi);
	System.out.println(wi.attack());
	System.out.println();

	Character c2;
	Warrior w2;
	Wizard wi2;

	c2 = w;
	System.out.println(c2.attack());

    }
}
