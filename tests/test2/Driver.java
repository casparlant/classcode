
public class Driver {
    public static void main(String[] args) {
	Ascii a = new Ascii();
	
	System.out.println(a.rect(3,8,"Y"));
	System.out.println(a.triangle1(5));
	System.out.println(a.triangle2(5));

	Loops l = new Loops();
	System.out.println(l.diag(5));
	System.out.println(l.diagWord("Hello"));
	System.out.println(l.fence(5,8));
    }

}
