import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Greg Anderson on 11/11/2016.
 */
public class ChristmasGiftExchange {

    public static void main(String[] args) {
        String yearString = JOptionPane.showInputDialog("What year is it?");
        int year;
        try {
            year = Integer.parseInt(yearString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid year :(");
            return;
        }

        // Just list the family members in the Arrays.asList() method
        LinkedList<String> families = new LinkedList<>(Arrays.asList("Christian", "Peter", "Greg", "Stephen"));
        LinkedList<String> target = new LinkedList<>();

        int familySize = families.size();

        for (int i = 0; i < familySize; i++)
            target.add(families.get((i + 1) % familySize));

        for (int i = 0; i < year % (familySize - 1); i++)
            target.addLast(target.pop());

        String result = "";
        for (int i = 0; i < familySize; i++)
            result += families.pop() + " → " + target.pop() + "\n";

        JOptionPane.showMessageDialog(null, result);
    }
}
