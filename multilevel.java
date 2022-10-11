/*Class A serves as a base class for the derived class B, 
which in turn serves as a base class for the derived class C.
(Which type Of Inheritance explain with an example)*/
// IT IS A MULTILEVEL INHERITANCE PROGRAM

 class Trees { // The base class
	void grow()
	{
		System.out.println("Trees are very important for living beings");
	}
}
class Leaves extends Trees //Derived class of Tree class
{
	void make()
	{
		System.out.println("Leaves makes food for plants");
	}
}
class Roots extends Leaves //Derived class of Leaves class
{
	void support()
	{
		System.out.println("Roots supports the plant");
	}
}
public class multilevel { // main class
	public static void main(String args[])
	{
		Trees t=new Trees();
		Leaves l=new Leaves();
		Roots r=new Roots();
		t.grow();
		l.make();
		r.support();
	}
}

