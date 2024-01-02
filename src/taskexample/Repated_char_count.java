package taskexample;

public class Repated_char_count {
	public static void main (String args[]) {
		String str = "range rover";
		int total_length = str.length();
		String aft=str.replace("r","");
		int len=aft.length();
		System.out.println(total_length-len);
	}

}
