package Model;


/**
 * PearPlanner
 * Created by Team BRONZE on 4/27/17
 */
public class Room extends VersionControlEntity
{
    // private data
    private Building building = null;
    private String roomNumber;


    @Override
    protected void replace(VersionControlEntity receivedVCE)
    {
        if (receivedVCE instanceof Room)
        {
            Room castedVCE = (Room) receivedVCE;
            this.building = castedVCE.getBuilding();
            this.roomNumber = castedVCE.getRoomNumber();
        }
        super.replace(receivedVCE);
    }

    // public methods


    // getters
    public Building getBuilding()
    {
        // initial set up code below - check if this needs updating
        return building;
    }

    public String getRoomNumber()
    {
        // initial set up code below - check if this needs updating
        return roomNumber;
    }

    // setters
    public void setBuilding(Building newBuilding)
    {
        // initial set up code below - check if this needs updating
        building = newBuilding;
    }

    public void setRoomNumber(String newRoomNumber)
    {
        // initial set up code below - check if this needs updating
        roomNumber = newRoomNumber;
    }

    public Room(String cRoomNumber, Building cBuilding)
    {
        setRoomNumber(cRoomNumber);
        setBuilding(cBuilding);
    }

    public Room(String cRoomNumber)
    {
        setRoomNumber(cRoomNumber);
    }

    @Override
    public String toString()
    {
        if (building == null)
        {
            return name + "( " + roomNumber + " )";
        } else
        {
            return name + "( " + roomNumber + " ) located in " + building.toString();
        }
    }
}
