package fixtures;

public class Room extends Fixture {
	
	//exits array
	private Room exits[];
	private String direction;
	
	//constructor
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[3]; // size is your choice
	}
	
	//method that returns array
	public Room[] getExits() {
		return exits;		
	}
		
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getDirection() {
		return this.direction;
	}
	
	public Room getExit(String direction) {
		return null;
		
	}
	
	
	public String getName() {
		return super.getName();
	}

	
	public String getShortDescription() {
		return super.getShortDescription(); 
	}


	public String getLongDescription() {
		return super.getLongDescription();
	}
	
	
	
	
}
