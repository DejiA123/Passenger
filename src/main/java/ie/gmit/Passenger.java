package ie.gmit;

public class Passenger {

    private String Title;    //Title
    private String Name;     // Name
    private String ID;       // ID
    private String Phone;    //Phone
    private String Age;      //Age

    public Passenger(String Title, String Name, String ID, String Phone, String Age)
    {
        this.Title = Title;
        this.Name = Name;
        this.ID = ID;
        this.Phone = Phone;
        this.Age = Age;

    }

    public String getTitle(){
        return Title;
    }

    public String getName() {
        return Name;
    }

    public String getID(){
        return ID;
    }

    public String getPhone(){
        return Phone;
    }

    public String getAge(){
        return Age;
    }

}
