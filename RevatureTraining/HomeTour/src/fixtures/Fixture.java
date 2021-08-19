package fixtures;

public abstract class Fixture {

	

	//variables
	String name; 
	String shortDescription; 
	String longDescription; 
	
	//constructor
	public Fixture(String name, String shortDescription, String longDescription) {
		this.name= name; 
		this.shortDescription= shortDescription; 
		this.longDescription= longDescription;
	
	
}
	
	//getters
	public String getName() {
		return name;
	}


	public String getShortDescription() {
		return shortDescription;
	}


	public String getLongDescription() {
		return longDescription;
	}


	
}
