public class Driver {
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
	c2 = w;
	System.out.println(c2+" "+c2.attack());
	// we can point a Character variable to a Character instance or an instance
	// of a class derived from Character, but we can't point a Warrior variable
	// to a Wizard or Character instance.

	System.out.println();
	System.out.println(wi.getHealth());
	System.out.println(wi.health);
	

    }

}
