public class Room {
    //Data members
    protected String number;
    protected int capacity;
    protected int area;
    /***
     * Constructor with three parameters
     * @param       number of the room
     * @param       capacity of the room
     * @param       area of the room
     */
    public Room(String number, int capacity, int area){
        this.number=number;
        this.capacity=capacity;
        this.area=area;
    }
    /***
     * Getter for the number of the room
     * @param       no parameters
     * @return      the value of the data member number
     */
    public String getNumber(){
        return number;
    }
    /***
     * Getter for the capcity of the room
     * @param       no parameters
     * @return      the value of the data member capacity
     */
    public int getCapacity(){
        return capacity;
    }
    /***
     * Getter for the area of the room
     * @param       no parameters
     * @return      the value of the data member area
     */
    public int getArea(){
        return area;
    }
    /***
     * Setter for the name of the room
     * @param       n to set the data member number
     * no return value
     */
    public void setNumber(String n){
        this.number=n;
    }
    /***
     * Setter for the capacity of the room
     * @param       c to set the data member capacity
     * no return value
     */
    public void setCapacity(int c){
        this.capacity=c;
    }
    /***
     * Setter for the area of the room
     * @param       a to set the data member area
     * no return value
     */
    public void setArea(int a){
        this.area=a;
    }
    /***
     * Method to get the Room information
     * no parameters
     * @return formatted string containing the value of the data members
     */
    public String toString(){
        return String.format("Room\t\t%s\t%d\t\t%d", number, capacity, area);
    }
}
