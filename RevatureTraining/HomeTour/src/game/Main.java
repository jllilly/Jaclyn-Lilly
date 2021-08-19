package game;

import java.util.Scanner;
import fixtures.Fixture;
import fixtures.Room;

public class Main {

	static Scanner scan = new Scanner(System.in);
	
	//print room method to print current room details
	public static void printRoom(Player player) {
	
		System.out.println(player.currentRoom.getName());
		System.out.println(player.currentRoom.getShortDescription());
		System.out.println(player.currentRoom.getLongDescription());
		
	}
	
	//collect action and target
	private static String[] collectInput() {
		System.out.println("Where would you like to go? Please enter go North, go South, or go East to learn more about what's inside!");
		return (scan.nextLine().split(" "));

		
	}
	
	//link up action to target and move player to particular room
	private static void parse(String[] command, Player player) {
		
		switch(command[1].toString()) {
		
		case "North":
			//bathroom
			player.currentRoom = RoomManager.rooms[1];
			break;
		
		case "South":
			//living room
			player.currentRoom = RoomManager.rooms[0];
			break;
		
		case "East":
			//bedroom
			player.currentRoom= RoomManager.rooms[2];
			break;
		
		case "West":
			//
			break;
			
			
		}
	}
	
	
	public static void main(String[] args) {
		//create a room manager
		RoomManager rm = new RoomManager();
		//creates my player
		Player player = new Player();
		//initializes all rooms
		rm.init();
		//sets my player in current room
		player.currentRoom = rm.startingRoom;
		
		
		while(true) {
			//scan action and target - sets player to target
			parse(collectInput(), player); 
			//prints info of the current room the player is in
			printRoom(player);
			
			//four loop to print out exists
			System.out.println("Exits");
			for (Room room: player.currentRoom.getExits()) {
				System.out.println(room.getDirection() + " : "+ room.getName());	
			}
		}
		
		
	}
	
	
	
	
}
