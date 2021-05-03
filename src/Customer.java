
import java.util.Date;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private Date dateTime;
    private String nationalIdentity;


    public Customer(int id, String firstName, String lastName, Date dateTime, String nationalIdentity){
            this.id=id;
            this.firstName=firstName;
            this.lastName=lastName;
            this.dateTime=dateTime;
            this.nationalIdentity=nationalIdentity;
    }

    public Customer(){

    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;

    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime){
        this.dateTime=dateTime;
    }
    public String getNationalIdentity(){
        return nationalIdentity;
    }
    public void setNationalIdentity(String nationalIdentity){
        this.nationalIdentity=nationalIdentity;
    }
}
