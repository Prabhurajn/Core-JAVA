/*	 ___________________________ 
	|							|
	| @Authore = Prabhu D N 	|
	| @Date = 20-01-2015    	|
	| @Problem Statement N0: 2  |
	|___________________________|
*/
import java.util.*;

class  CountCharacters {
  	public static void main(String[] args) throws Exception {
  	
  		Scanner input=new Scanner(System.in);
  		System.out.print("Please enter string ");
  		System.out.println();
  		String str=input.nextLine();
  		String st=str.replaceAll(" ", "");

  		char[]third =st.toCharArray();
  	
  		for(int counter =0;counter<third.length;counter++) {
  			char ch= third[counter];
  			int count=0;
  			for ( int i=0; i<third.length; i++) {
  				if (ch==third[i])
  				count++;
			}

			boolean flag=false;

			for(int j=counter-1;j>=0;j--) {
				if(ch==third[j])
				flag=true;
			}
		
			if(!flag) {
				System.out.print(ch+""+count);
			}
		}
	}
}