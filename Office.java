public class Office extends Room {
    //Data member
    protected String owner;
    /***
     * Constructor with four parameters
     * @param       number of the room
     * @param       capacity of the room
     * @param       area of the room
     * @param       owner of the room
     */
    public Office(String number, int capacity, int area, String owner){
        super(number, capacity, area);
        this.owner=owner;
    }
    /***
     * Getter for the owner of the room
     * @param       no parameters
     * @return      the value of the data member owner
     */
    public String getOwner(){
        return owner;
    }
    /***
     * Setter for the owner of the room
     * @param       o to set the data member owner
     * no return value
     */
    public void setOwner(String o){
        this.owner=o;
    }
    /***
     * Method to get the Office information
     * no parameters
     * @return formatted string containing the value of the data members
     */
    public String toString(){
        return String.format("%3s%12s%3d%11d%19s", "Office", number, capacity, area, owner);
    }
}
