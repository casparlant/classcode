
import java.util.*;

public class RandomDriver {
    public static void main(String[] args) {
	/* Using Math and Math.random

	System.out.println(Math.PI);
	System.out.println(Math.pow(2,10));

	double rawval = Math.random();
	int value = (int)(100*rawval);

	System.out.println(rawval);
	System.out.println(value);
	*/

	/* Using the Random class */
	Random r = new Random(123);
	System.out.println(r.nextDouble());
	System.out.println(r.nextDouble());

	System.out.println(r.nextInt());
	System.out.println(r.nextInt());

	System.out.println(r.nextInt(100));
	System.out.println(r.nextInt(100));


	System.out.println(4!=4||2>5);

    }
}
