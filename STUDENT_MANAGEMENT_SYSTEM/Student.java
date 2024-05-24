import java.io.Serializable;

public class Student implements Serializable 
{
    private String name;
    private String surname;
    private String gender;
    private int age;
    private String enrollmentNumber;
    private String courseName;

    public Student(String name, String surname, String gender, int age, String enrollmentNumber, String courseName) 
    {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.enrollmentNumber = enrollmentNumber;
        this.courseName = courseName;
    }

    // Getters and Setters for each attribute
    public String getName() 
    { 
        return name; 
    }
    public void setName(String name) 
    { 
        this.name = name; 
    }

    public String getSurname() 
    { 
        return surname; 
    }
    public void setSurname(String surname) 
    { 
        this.surname = surname; 
    }

    public String getGender() 
    { 
        return gender; 
    }
    public void setGender(String gender) 
    { 
        this.gender = gender; 
    }

    public int getAge() 
    { 
        return age;
    }
    public void setAge(int age) 
    { 
        this.age = age; 
    }

    public String getEnrollmentNumber() 
    { 
        return enrollmentNumber; 
    }
    public void setEnrollmentNumber(String enrollmentNumber) 
    { 
        this.enrollmentNumber = enrollmentNumber; 
    }

    public String getCourseName() 
    { 
        return courseName; 
    }
    public void setCourseName(String courseName) 
    { 
        this.courseName = courseName; 
    }

    @Override
    public String toString() 
    {
        return "Student [Name=" + name + ", Surname=" + surname + ", Gender=" + gender + ", Age=" + age +
                ", Enrollment Number=" + enrollmentNumber + ", Course Name=" + courseName + "]";
    }
}
