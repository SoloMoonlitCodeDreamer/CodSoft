import javax.swing.JOptionPane;

public class ATM 
{
    private User user;

    public ATM(User user) 
    {
        this.user = user;
    }

    public void showOptions() 
    {
        boolean exitLoop = false;

        while (!exitLoop) 
        {
            String[] options = { "Withdraw", "Deposit", "Check Balance", "Check User Info", "Exit" };
            int choice = JOptionPane.showOptionDialog(null, "Select an option:", "ATM Machine", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            switch (choice) 
            {
                case 0:
                    withdraw();
                    break;
                case 1:
                    deposit();
                    break;
                case 2:
                    checkBalance();
                    break;
                case 3:
                    checkUserInfo();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Thank you for using the ATM :)");
                    exitLoop = true;
                    break;
                default:
                    break;
            }
        }
    }

    private void withdraw() 
    {
        String input = JOptionPane.showInputDialog("Enter the amount you would like to withdraw:");
        try 
        {
            double amount = Double.parseDouble(input);
            if (amount > 0 && user.getBalance() >= amount) 
            {
                user.withdraw(amount);
                JOptionPane.showMessageDialog(null, "Withdrawal successful. Your Current Balance is: R" + user.getBalance());
            } else 
            {
                JOptionPane.showMessageDialog(null, "Insufficient balance :(");
            }
        } catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number :)");
        }
    }

    private void deposit() 
    {
        String input = JOptionPane.showInputDialog("Enter the amount you would like to deposit:");
        try 
        {
            double amount = Double.parseDouble(input);
            if (amount > 0) 
            {
                user.deposit(amount);
                JOptionPane.showMessageDialog(null, "Deposit was successful. Your Current Balance is: R" + user.getBalance());
            } else 
            {
                JOptionPane.showMessageDialog(null, "Invalid amount:(");
            }
        } catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number:(");
        }
    }

    private void checkBalance() 
    {
        JOptionPane.showMessageDialog(null, "Your Current Balance is: R" + user.getBalance());
    }

    private void checkUserInfo() 
    {
        String userInfo = user.getUserInformation();
        JOptionPane.showMessageDialog(null, userInfo, "User Information :)", JOptionPane.INFORMATION_MESSAGE);
    }
}
