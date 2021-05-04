package ajw126_lab7;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArrayProcessMain {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("How many items will be entered into the array?");
		int values = Integer.parseInt(input);
		
		double array[] = new double[values];
		
		for (int i = 0; i < array.length; i++) { 
			 array[i] = Math.random();
			}
		
		System.out.println(Arrays.toString(array));
		System.out.println("The maximum is: " + ArrayProcessor.max(array));
		System.out.println("The minimum is: " + ArrayProcessor.min(array));
		System.out.println("The sum is: " + ArrayProcessor.sum(array));
		System.out.println("The average is: " + ArrayProcessor.avg(array));
		
		
	}


}


