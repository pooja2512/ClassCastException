package com.ClassCastExce;
//Example of ClassCastException
interface Animal
{
	void makesound();
}

class Cat implements Animal
{
	public void makesound()
	{
		System.out.println("Meow");
	}
}

class Dog implements Animal
{
	public void makesound()
	{
	System.out.println("Bark");
	}
	
}

class Tiger implements Animal
{
	public void makesound()
	{
	System.out.println("Roar");
	}
	
	public void hunt()
	{
		System.out.println("Hunting...");
	}
}

public class ClassCastException 
{
	static void action(Animal ref)
	{
		ref.makesound();
		
		if(ref instanceof Tiger)
		{
			Tiger tig = (Tiger)ref;
			tig.hunt();
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		action(new Dog());
		action(new Cat());
		action(new Tiger());

	}

}
