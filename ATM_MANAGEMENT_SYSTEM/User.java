import java.time.LocalDate;
import java.time.Period;

public class User extends BankAccount 
{
    private String name;
    private String surname;
    private String dateOfBirth;
    private String emailAddress;
    private int age;

    public User(String name, String surname, String dateOfBirth, String emailAddress, double balance) 
    {
        super(balance);
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.age = calculateAge(dateOfBirth);
    }

    private int calculateAge(String dateOfBirth) 
    {
        LocalDate dob = LocalDate.parse(dateOfBirth);
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();
    }

    public String getName() 
    {
        return name;
    }

    public String getSurname() 
    {
        return surname;
    }

    public String getDateOfBirth() 
    {
        return dateOfBirth;
    }

    public String getEmailAddress() 
    {
        return emailAddress;
    }

    public int getAge() 
    {
        return age;
    }

    public String getUserInformation() 
    {
        return "Name: " + name + " " + surname + "\nDate of Birth: " + dateOfBirth + "\nAge: " + age +
                "\nEmail Address: " + emailAddress;
    }
}
