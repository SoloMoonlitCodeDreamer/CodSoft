import javax.swing.JOptionPane;

public class Main 
{
    public static void main(String[] args) 
    {
        // Display a welcome message
        JOptionPane.showMessageDialog(null, "Welcome to the ATM Interface!");
        
        String name = JOptionPane.showInputDialog("Enter Your First Name:");
        String surname = JOptionPane.showInputDialog("Enter Your Surname:");
        String dateOfBirth = JOptionPane.showInputDialog("Enter Your date of Birth (YYYY-MM-DD):");
        String emailAddress = JOptionPane.showInputDialog("Enter Your Email Address:");
        String initialBalance = JOptionPane.showInputDialog("Enter initial balance:");

        try 
        {
            double balance = Double.parseDouble(initialBalance);
            User user = new User(name, surname, dateOfBirth, emailAddress, balance);
            ATM atm = new ATM(user);

            atm.showOptions();
        } catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Invalid input. Exiting program :(");
        }
    }
}
