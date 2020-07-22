package com.epam.loggingdemo;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




abstract class CalculateCost
{
	abstract void show(String material,int area);
	
}
class Material extends CalculateCost
{int total;
	void show(String material,int area)
	{
		if(material.equals("Standard") )
		{
			total=area * 1200;
			System.out.println("The cost required to build a house"+total);
		}
		if(material.equals(" Above Standard") )
		{
			total=area * 1500;
			System.out.println("The cost required to build a house"+total);
		}
		if(material.equals(" High Standard") )
		{
			total=area * 1800;
			System.out.println("The cost required to build a house"+total);
		}
		if(material.equals("High Standard and Fully Automated") )
		{
			total=area * 2500;
			System.out.println("The cost required to build a house"+total);
		}
		
	}
}

class House {
	public static void main(String args[]){
		Logger LOG  =LogManager.getLogger(House.class);
		String typeOfMaterial;
		int areaOfHouse;
		Scanner sc=new Scanner (System. in);
		LOG.info(" Enter the type of material");
		typeOfMaterial=sc.nextLine();
		LOG.info(" Enter the area");
		areaOfHouse=sc.nextInt();
		Material m = new Material();
		m.show(typeOfMaterial, areaOfHouse);
		sc.close();
				
	}

}
