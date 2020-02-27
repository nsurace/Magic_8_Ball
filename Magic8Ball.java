import javax.swing.JOptionPane;
import java.util.Random;

public class Magic8Ball
{
	public static void main(String[] args) 
	{
		//Variables and Constants
		String[] responses = {"It is certain", "Ask again later", "Without a doubt", "Signs point to yes", "My sources say no", "Concentrate and ask again", "Very doubtful", "Most likely"};
		Random random = new Random();
		int index = random.nextInt(responses.length);
		String msg = responses[index];
		String selection;
		boolean quit = false;

		do
		{
			//Input Phase
			selection = JOptionPane.showInputDialog(null, "Please type your question and I will do my best to answer\nOr type QUIT to exit the program");

			if(selection.equalsIgnoreCase("quit"))
			{
				quit = true;
				JOptionPane.showMessageDialog(null, "Goodbye!");
			}
			else
			{
			//Output Phase
			JOptionPane.showMessageDialog(null, "You asked:\n" + selection + "\nMagic 8 Ball's Response:\n" + msg);
			index = random.nextInt(responses.length);
			msg = responses[index];
			}
		}
			while(quit != true);
	}		
}