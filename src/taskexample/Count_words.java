package taskexample;

public class Count_words {
	public static void main(String[] args)
	{
		String str="iam not a good boy";
		int count=0;
		for(int i=0; i<str.length(); i++) 
		{
			if(str.charAt(i)==' ') 
			{
				count++;
			}
		}
		count=count+1;
		System.out.println(" Words  is = "+count);
	}
}


