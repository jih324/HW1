/***
 * Class that contains the main method
 * @author Daniel Han
 * @version 1.60.0
 * Date of creation: September 4, 2021
 * Last Date Modified: September 5, 2021
 */

import java.util.Scanner;

public class Test {
    
    /***
     * Main method
     * @param       array of String objects
     * no return value
     */
    public static void main(String[] args){
        Room[] rooms=new Room[5];
        rooms[0]=new Lab("PA-110", 65, 150, 45);
        rooms[1]=new Office("PA-252", 2, 36, "Houria Oudghiri");
        rooms[2]=new Lab("PA-202", 45, 100, 25);
        rooms[3]=new Classroom("PA101", 20, 45);
        rooms[4]=new Lab("PA100", 47, 120, 40);

        Scanner scnr=new Scanner(System.in);
        String userInput;

        do{
            System.out.printf("Select an operation:%n1: find a room%n2: view all rooms%n3: sort rooms%n4: exit%n");
            userInput = scnr.next();
            if (userInput.equals("1")){
                System.out.println("Enter the room number:");
                String userNumber = scnr.next();
                if (findRoom(rooms, userNumber) == -1){
                    System.out.println("Room not found.");
                }
                else{
                    System.out.printf("Room found: " + rooms[findRoom(rooms, userNumber)].toString() + "\n");
                }
            }
            if (userInput.equals("2")){
                printRooms(rooms);
            }
            if (userInput.equals("3")){
                sortRooms(rooms);
            }
            if (userInput.equals("4")){
                System.out.println("Thank you for using my program!");
            }
        }while (!userInput.equals("4"));
    }

    /***
     * Method that prints elements of an array passed in as a parameter
     * @param       array containing objects Room
     * no return value
     */
    public static void printRooms(Room[] list){
        System.out.printf("%s%14s%10s%6s%17s\n", "Type", "Number", "Capacity", "Area", "Owner/Computers");
        for (int i=0; i<list.length; i++){
            System.out.println(list[i].toString());
        }
        System.out.println();
    }

    /***
     * Method that finds the room based on the user's input of room number
     * @param       array containing objects Room and string that represents room number
     * @return      integer that represents the index of the room the user is looking for
     */
    public static int findRoom(Room[] list, String roomNumber){
        int roomIndex=-1;
        for (int i=0; i<list.length; i++){
            if (list[i].getNumber().equals(roomNumber)){
                roomIndex=i;
            }
        }
        return roomIndex;
    }

    /***
     * Method that sorts the rooms in an ascending order based on capacity
     * @param       array containing objects Room
     * no return value
     */
    public static void sortRooms(Room[] list){
        for (int i=1; i<list.length; i++) {
            int currentVal = list[i].getCapacity();
            Room currentRoom = list[i];
            int j = i;
            while (j > 0 && currentVal < (list[j - 1].getCapacity())){
                list[j] = list[j - 1];
                j--;
            }
           list[j] = currentRoom;
           }
        System.out.println();
    }
}
