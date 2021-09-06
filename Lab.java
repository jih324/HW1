public class Lab extends Room {
    //Data member
    protected int computers;
    /***
     * Constructor with four parameters
     * @param       number of the room
     * @param       capacity of the room
     * @param       area of the room
     * @param       computers of the room
     */
    public Lab(String number, int capacity, int area, int computers){
        super(number, capacity, area);
        this.computers=computers;
    }
    /***
     * Getter for the number of computers in the room
     * @param       no parameters
     * @return      the value of the data member computers
     */
    public int getComputers(){
        return computers;
    }
    /***
     * Setter for the number of the computers in the room
     * @param       c to set the data member computers
     * no return value
     */
    public void setComputers(int c){
        this.computers = c;
    }
    /***
     * Method to get the Lab information
     * no parameters
     * @return formatted string containing the value of the data members
     */
    public String toString(){
        return String.format("Lab%15s%4d%11d%5d", number, capacity, area, computers);
    }
}
