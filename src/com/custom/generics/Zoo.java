package com.custom.generics;


public class Zoo {

	public static void main(String[] args) {
		
		//Cage<Elephant> eleCage=new Cage<>(new Elephant(), new Lion());
		Cage<Elephant> eleCage=new Cage<>(new Elephant(), new Elephant());

		Cage<Monkey> monkeyCage=new Cage<>();
		monkeyCage.setAnimal1(new Monkey());
		monkeyCage.setAnimal2(new Monkey());
		
		Cage<Lion> lionCage=new Cage<>();
		lionCage.setAnimal1(new Lion());
		lionCage.setAnimal2(new Lion());
		
		
		
		
	}

}
