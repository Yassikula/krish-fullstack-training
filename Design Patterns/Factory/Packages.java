package Factory;

import java.util.ArrayList;

public abstract class Packages {

	protected ArrayList<Offer> offer = new ArrayList<>();

	public Packages() {

		createPachage();
	}

	protected abstract void createPachage();
	

    public String toString(){
        return "Package "+offer;
    }
	
	
	
	
}
