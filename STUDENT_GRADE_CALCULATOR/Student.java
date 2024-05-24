import javax.swing.JOptionPane;

public class Student 
{
    private String name;
    private int totalMarks;
    private double avgPercentage;
    private String[] subjects;
    private int[] subjectMarks;

    public Student(String name, int numSubjects) 
    {
        this.name = name;
        this.totalMarks = 0;
        this.avgPercentage = 0.0;
        this.subjects = new String[numSubjects];
        this.subjectMarks = new int[numSubjects];
    }

    public void inputMarks() 
    {
        for (int i = 0; i < subjects.length; i++) 
        {
            subjects[i] = JOptionPane.showInputDialog("Enter subject " + (i + 1) + " name:");
            int marks = Integer.parseInt(JOptionPane.showInputDialog("Enter marks obtained in " + subjects[i] + " (out of 100):"));
            subjectMarks[i] = marks;
            totalMarks += marks;
        }
        calculateAveragePercentage(subjects.length);
    }

    private void calculateAveragePercentage(int numSubjects) 
    {
        avgPercentage = (double) totalMarks / numSubjects;
    }

    public void displayResults() {
        StringBuilder subjectsInfo = new StringBuilder();
        for (int i = 0; i < subjects.length; i++) 
        {
            subjectsInfo.append(subjects[i]).append(": ").append(subjectMarks[i]).append("\n");
        }

        String grade = calculateGrade();
        JOptionPane.showMessageDialog(null, "Name: " + name + "\nTotal Marks: " + totalMarks +
                "\nAverage Percentage: " + avgPercentage + "%\nGrade: " + grade +
                "\n\nSubjects and Marks:\n" + subjectsInfo.toString());
    }

    private String calculateGrade() 
    {
        if (avgPercentage >= 90) 
        {
            return "A+";
        } else if (avgPercentage >= 80) 
        {
            return "A";
        } else if (avgPercentage >= 70) 
        {
            return "B";
        } else if (avgPercentage >= 60) 
        {
            return "C";
        } else if (avgPercentage >= 50) 
        {
            return "D";
        } else 
        {
            return "Fail";
        }
    }

    public double getAvgPercentage() 
    {
        return avgPercentage;
    }
}
