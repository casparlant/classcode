
public class Driver {
    public static void main(String[] args) {
	Coin c1 = new Coin();
	Coin c2 = new Coin("Tails");
	Coin c3 = new Coin("Heads");
	
	System.out.println(c1.getFace()+" "+c2.getFace()+" "+c3.getFace());

	System.out.println(c1.sameFace(c2));
	System.out.println(c1.sameFace(c3));
	System.out.println(c2.sameFace(c3));

    }
}
