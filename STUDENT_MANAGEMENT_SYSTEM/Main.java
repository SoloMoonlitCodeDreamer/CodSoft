import javax.swing.JOptionPane;    
public class Main 
{
    public static void main(String[] args) 
    {
        StudentManagementSystem sms = new StudentManagementSystem();
        while (true) 
        {
            String[] options = {"Add Student", "Remove Student", "Search Student", "Display All Students", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Welcome to Student Management System\nTotal Students: " + sms.getStudentCount(), 
                                                      "Main Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) 
            {
                case 0:
                    addStudentDialog(sms);
                    break;
                case 1:
                    removeStudentDialog(sms);
                    break;
                case 2:
                    searchStudentDialog(sms);
                    break;
                case 3:
                    sms.displayAllStudents();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Exiting the system. Goodbye!");
                    System.exit(0);
            }
        }
    }

    private static void addStudentDialog(StudentManagementSystem sms) 
    {
        try {
            String name = JOptionPane.showInputDialog("Enter name:");
            String surname = JOptionPane.showInputDialog("Enter surname:");
            String gender = JOptionPane.showInputDialog("Enter gender:");
            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
            String enrollmentNumber = JOptionPane.showInputDialog("Enter enrollment number:");
            String courseName = JOptionPane.showInputDialog("Enter course name:");

            if (name.isEmpty() || surname.isEmpty() || gender.isEmpty() || enrollmentNumber.isEmpty() || courseName.isEmpty()) 
            {
                throw new IllegalArgumentException("All fields must be filled!");
            }

            Student student = new Student(name, surname, gender, age, enrollmentNumber, courseName);
            sms.addStudent(student);
        } catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Age must be a number!");
        } catch (IllegalArgumentException e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private static void removeStudentDialog(StudentManagementSystem sms) 
    {
        String enrollmentNumber = JOptionPane.showInputDialog("Enter enrollment number of the student to remove:");
        if (enrollmentNumber != null && !enrollmentNumber.isEmpty()) 
        {
            sms.removeStudent(enrollmentNumber);
        } else 
        {
            JOptionPane.showMessageDialog(null, "Enrollment number cannot be empty!");
        }
    }

    private static void searchStudentDialog(StudentManagementSystem sms) 
    {
        String enrollmentNumber = JOptionPane.showInputDialog("Enter enrollment number of the student to search:");
        if (enrollmentNumber != null && !enrollmentNumber.isEmpty()) 
        {
            Student student = sms.searchStudent(enrollmentNumber);
            if (student != null) 
            {
                JOptionPane.showMessageDialog(null, student.toString());
            }
        } else 
        {
            JOptionPane.showMessageDialog(null, "Enrollment number cannot be empty!");
        }
    }
}
