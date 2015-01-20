/*	 ___________________________ 
	|							|
	| @Authore = Prabhu D N 	|
	| @Date = 20-01-2015    	|
	| @Problem Statement N0: 3  |
	|___________________________|
*/
import java.io.*;
class Student {
	private String firstname;
	private String lastname;

	Student(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	}
   	public String getFirstname() {
	        return firstname;
	}

	public void setFirstname(String firstname) {
	        this.firstname = firstname;
	}
	public String getLastname() {
	        return lastname;
	}
	public void setLastname(String lastname ) {
	        this.lastname = lastname;
	}
}

public class StudentInfo {
	public static void main(String[] args) throws Exception {
   		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of student");
		int n=Integer.parseInt(br.readLine());
		Student []obj=new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the "+(i+1)+" information");
			System.out.print("Enter the first name: ");
			String firstname=br.readLine();
			System.out.print("Enter the last name: ");
			String lastname=br.readLine();
			System.out.println("**********************************");
			obj[i]=new Student(firstname,lastname);

		}

		int []pos=new int[n+1];
		int k=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(obj[i].getLastname().equals(obj[j].getLastname()))
				{
					pos[k]=j;
					k++;
					continue;
				}				
			}
		}
		
		System.out.println("Postion Array");
		
		int count=k;
		System.out.println("************************************************");
		System.out.println("Distinct Student Information	");
		System.out.println("************************************************");
		int loc=0;
		for(int i=0;i<n;i++)
		{
			if(i==pos[loc])
			{
				loc++;
				continue;
			}
			else{
			  System.out.println("Student Name :"+obj[i].getFirstname()+"\t"+obj[i].getLastname());
			}
		}
		System.out.println("*************************************************");
	}
}
