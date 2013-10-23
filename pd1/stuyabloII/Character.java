import java.util.*;
import java.io.*;

public class Character {
    protected int health;
    private String name;
    private Random r = new Random();

    protected void init(String name, int health) {
	this.name = name;
	this.health=health;
    }

	
    public Character() {
	init("unnamed characet",50+r.nextInt(50));
    }
    
    public Character(String n) {
	init(n,50+r.nextInt(50));
    }

    public Character(String n, int h) {
	init(n,h);
    }


    public String attack() {
	return "Generic attack";
    }


    public String toString() {
	return name;
    }

}
