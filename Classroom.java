public class Classroom extends Room{
    /***
     * Constructor with three parameters
     * @param       number of the room
     * @param       capacity of the room
     * @param       area of the room
     */
    public Classroom(String number, int capacity, int area){
        super(number, capacity, area);
    }
    /***
     * Method to get the Classroom information
     * no parameters
     * @return formatted string containing the value of the data members
     */
    public String toString(){
        return String.format("%3s%8s%5d%10d", "Classroom", number, capacity, area);
    }
}
