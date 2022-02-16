/*
 ***********************************************
Workshop #
Course:JAC444 - Semester 4
Last Name:Pelegrini de Oliveira
First Name:Rafaela
ID:053660130
Section:NFF
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:2021-10-03
 **********************************************/
package lab2;
/*
 * program 2 calculate totals for sales slips
 */
public class Task1 {

	private static int ROWS=5;
	private static int COLUMNS=4;
	//array of prod/person
	private static double[][]sales=new double [ROWS][COLUMNS];
	//array of sales slips
	private static SalesSlip[]salesSlips= new SalesSlip[100];


	public static void main(String[] args) {

		makeSaleSlips();//make saleslips
		processSaleSlips();//process salesSlips
		printResults();//print totals
	}

	//function to make sales slips
	public static void makeSaleSlips() {
		int person = 0;
		int product =0;
		double value=0;
		//loop for number of sales 
		for(int i=0;i<salesSlips.length;i++) {
			value =Math.random()*100;//make random sale value
			salesSlips[i]=new SalesSlip(product,person,value);// make a sale slip for the sale
			person++;//increment person 
			person=person%sales[0].length;
			product++;//increment product 
			product=product%sales.length;
		}	 
	}	
	//function to process sales slips
	public static void processSaleSlips() {
		int person = 0;
		int product =0;
		double value=0;
		//loop through sales slips
		for(int i =0;i<salesSlips.length;i++)
		{
			person= salesSlips[i].getPerson();//get person
			product= salesSlips[i].getProduct();//get product
			value= salesSlips[i].getValue();//get sales value
			sales[person][product]+=value; //put value in sales array for person/product
			//System.out.println(person+" "+product);	
		}
	}

	//print all results
	public static void printResults() {
		double [] columnTotals = new double [COLUMNS];//make array to total columns
		//print table heading 
		System.out.println("Prod/Person  1       2       3       4       Total");
		//loop through the sales array 
		for(int i=0;i<sales.length;i++) {
			System.out.printf("%8d     ",(i+1));//print out product number
			double total=0;//total rows 
			//loop to print out sales for each person for this product 
			for(int j=0;j<sales[i].length;j++)
			{
				System.out.printf("%-8.2f",sales[i][j]);//print out the sales
				total+=sales[i][j];//total the row
				columnTotals[j]+= sales[i][j];//total of the column

			}
			System.out.printf("%-8.2f\n",total);//print row total 
		}
		//print out column totals
		System.out.print("      Total ");
		for(int i =0;i<columnTotals.length;i++) {
			System.out.printf("%8.2f",columnTotals[i]);
		}
	}
}


