/*	 ___________________________ 
	|							|
	| @Authore = Prabhu D N 	|
	| @Date = 20-01-2015    	|
	| @Problem Statement N0: 1  |
	|___________________________|
*/
import java.io.*;
class InsuranceCost
{
	private int n,pos;
	private double []num_array;
	private double []num;
	private double max_weight=0;

	InsuranceCost() {

	}

	InsuranceCost(int n) {
		this.n=n;
	}

	public void enterData() throws IOException {
		int size=n+1;
		num=new double[size];
		num_array=new double[size];	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("The the weight in each "+n+" box");
		for(int i=0;i<n;i++)
		{
			num_array[i]=Integer.parseInt(br.readLine());
		}
	  maxWeightBox();
	}

	public void maxWeightBox() {
		for(int j=0;j<n;j++)
		{
			if(num_array[j]>max_weight)
			{
				max_weight=num_array[j];
				pos=j;
			}
		}
		calInsurance();
	}

	public void calInsurance() {	
		for(int j=0;j<n;j++)
		{	
			if(j==pos)
				num[j]=num_array[j]*3.5;
			else
				num[j]=num_array[j]*2;
		}
		display();
	}

	public void display() {
		double total=0;
		System.out.println("**************************************************");
		for(int j=0;j<n;j++)
		{
			total+=num[j];
			System.out.println("Box "+num_array[j]+"\t Weight "+num[j]);
		}	
		System.out.println("***************************************************");
		System.out.println("Total Insurance cost ="+total);		
	}

	public static void main(String []args) throws IOException {
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of boxes");
		int box=Integer.parseInt(br1.readLine());
		InsuranceCost obj=new InsuranceCost(box);
		obj.enterData();				
	}
}