package game;

import java.util.Arrays;

import fixtures.Room;

public class RoomManager {

	Room startingRoom; 
	static Room[] rooms = new Room[3];
	
	public void init() {
	    Room livingRoom = new Room(
			"The Living Room",
			"a small living room",
			"The small living room is pretty empty as I recently moved in. You will see two matching couch sets to your left, and a TV stand straight ahead."+ "\n"
			+ "There is no T.V yet as it still needs to be purchased and set up."); 
			this.rooms[0] = livingRoom;
	        this.startingRoom = livingRoom;
	        livingRoom.setDirection("South");
	       
	
	
	   Room bathRoom = new Room(
				"The Bath Room",
				"a small bathroom",
				"Unfortunately this bathroom is not impressive. As you enter you see your tiny toliet to the right, next to the tub." + "\n"
				+ "The tile floors give the bathroom a nice cool feeling."); 
			
				this.rooms[1] = bathRoom;
				bathRoom.setDirection("North");


		Room bedRoom = new Room(
			"The Bed Room",
			"a master bedroom",
			"This is the best spot in the house. Huge bed straight ahead. Various pictures hanging along the wall." + "\n"
			+ "Large walk in closet."); 
			this.rooms[2] = bedRoom;
			bedRoom.setDirection("East");
			
	//sets neighboring rooms
		livingRoom.setExits(new Room[] {bathRoom,bedRoom});
		bathRoom.setExits(new Room[] {livingRoom,bedRoom});
		bedRoom.setExits(new Room[]{bathRoom,livingRoom});
		
			
	}
	
	
}
