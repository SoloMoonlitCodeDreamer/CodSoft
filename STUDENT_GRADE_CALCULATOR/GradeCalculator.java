import javax.swing.JOptionPane;

public class GradeCalculator 
{
    public static void main(String[] args) 
    {
        boolean exit = false;

        while (!exit) 
        {
            String name = JOptionPane.showInputDialog("Enter student's name:");
            int numSubjects = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of subjects:"));

            Student student = new Student(name, numSubjects);
            student.inputMarks();
            student.displayResults();

            int option = JOptionPane.showConfirmDialog(null, "Do you want to calculate grades for another student?",
                    "Grade Calculator", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.NO_OPTION) 
            {
                JOptionPane.showMessageDialog(null, "Thank you for using the Grade Calculator!");
                exit = true;
            }
        }
    }
}
