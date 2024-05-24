import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class StudentManagementSystem 
{
    private ArrayList<Student> students;
    private static final String FILE_NAME = "students.dat";

    public StudentManagementSystem() 
    {
        students = new ArrayList<>();
        loadStudents();
    }

    public void addStudent(Student student) 
    {
        students.add(student);
        saveStudents();
        JOptionPane.showMessageDialog(null, "Student added successfully!");
    }

    public void removeStudent(String enrollmentNumber) 
    {
        Iterator<Student> iterator = students.iterator();
        boolean found = false;
        while (iterator.hasNext()) 
        {
            Student student = iterator.next();
            if (student.getEnrollmentNumber().equals(enrollmentNumber)) 
            {
                iterator.remove();
                saveStudents();
                found = true;
                JOptionPane.showMessageDialog(null, "Student removed successfully!");
                break;
            }
        }
        if (!found) 
        {
            JOptionPane.showMessageDialog(null, "Student not found!");
        }
    }

    public Student searchStudent(String enrollmentNumber) 
    {
        for (Student student : students) 
        {
            if (student.getEnrollmentNumber().equals(enrollmentNumber)) 
            {
                return student;
            }
        }
        JOptionPane.showMessageDialog(null, "Student not found!");
        return null;
    }

    public void displayAllStudents() 
    {
        if (students.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "No students to display!");
        } 
        else 
        {
            StringBuilder sb = new StringBuilder();
            int studentNumber = 1;
            for (Student student : students) 
            {
                sb.append("Student ").append(studentNumber++).append("\n");
                sb.append("Name: ").append(student.getName()).append("\n");
                sb.append("Surname: ").append(student.getSurname()).append("\n");
                sb.append("Gender: ").append(student.getGender()).append("\n");
                sb.append("Age: ").append(student.getAge()).append("\n");
                sb.append("Enrollment Number: ").append(student.getEnrollmentNumber()).append("\n");
                sb.append("Course Name: ").append(student.getCourseName()).append("\n");
                sb.append("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-").append("\n\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    public int getStudentCount() 
    {
        return students.size();
    }

    private void saveStudents() 
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) 
        {
            oos.writeObject(students);
        } catch (IOException e) 
        {
            JOptionPane.showMessageDialog(null, "Error saving student data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void loadStudents() 
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) 
        {
            students = (ArrayList<Student>) ois.readObject();
        } catch (FileNotFoundException e) 
        {
            // File not found, no students loaded
        } catch (IOException | ClassNotFoundException e) 
        {
            JOptionPane.showMessageDialog(null, "Error loading student data: " + e.getMessage());
        }
    }
}
