package taskexample;

public class stringreverse {
	public static void main (String args[]) {
		String str="marolix";    //0 1 2 3 4 5 6
		String demo = "";
		for(int i=str.length()-1; i >=0 ; i--) {//going to start from the 6 thats the reason given -1
			demo=demo+str.charAt(i);
		}
		
		System.out.println(demo);
	}
	
	

}
