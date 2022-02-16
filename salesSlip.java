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
 * class to store Sale slip info
 */

public class SalesSlip {
	private int person;
	private int product;
	private double value;

	//initialize SalesSlip
	SalesSlip(int person,int product,double value) {

		this.person=person;
		this.product=product;
		this.value=value;

	}
	//return person
	int getPerson(){
		return person;
	}
	//return product
	int getProduct(){
		return product;

	}
	//return value	
	double getValue(){
		return value;
	}

}
