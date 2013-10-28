import java.util.*;
import java.io.*;

public class Character {
    protected int health;
    protected String name;
    private Random r = new Random();

    protected void init(String name, int health) {
	this.name = name;
	this.health=health;
    }
    
    public Character() {
	init("",10);

    }
    public Character(String name) {
	this.name = name;

    }


    public String attack() {
	return "Generic attack";
    }


    public String toString() {
	return name;
    }

}
