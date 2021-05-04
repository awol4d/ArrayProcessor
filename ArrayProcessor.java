package ajw126_lab7;

public class ArrayProcessor {

	public static double max(double[] data){
		double max = data[0];
		for(int i = 0; i< data.length; i++){
			if(data[i] > max) max = data[i];
		}
		return max;
	}

	public static double min(double[] data){
		double min = data[0];
		for(int i = 0; i< data.length; i++){
			if(data[i] < min) min = data[i];
		}
		return min;
	}
	
	public static double sum(double[] data){
		double total = 0; 
		for (double element : data) {
			total = total + element;
		}
		return total;
		}
	
	
	public static double avg(double[] data){
		double sum = 0;
		if(data == null) return 0;
		if(data.length == 0) return 0;
		
		for(int i = 0; i < data.length; i++){
			sum = sum + data[i];
		
		}
		return (sum/data.length);
	}
}