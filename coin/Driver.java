
public class Driver {
    public static void main(String[] args) {
	Coin head1 = new Coin();
	String s = new String("Tails");
	Coin tail = new Coin(s);
	s = new String("Heads");
	Coin head2 = new Coin(s);
	
	System.out.println(head1.getFace()+" "+tail.getFace()+" "+head2.getFace());

	System.out.println(head1.sameFace(tail));
	System.out.println(head1.sameFace(head2));
	System.out.println(tail.sameFace(head2));
	System.out.println(head2.sameFace(head1));
	
	

    }
}
