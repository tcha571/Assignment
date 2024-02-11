package AssignmentModule3;
/*
 * W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It
has two subclasses each having a method with the same name
'message' that prints "This is first subclass" and "This is second
subclass" respectively. 
 */

abstract class Parent
{
public abstract void message();
}
 
abstract class child1 extends Parent
{
public void display()
{
System.out.println("This is First subclass");	
}
}
class  child2 extends child1
{
public  void message()
{
System.out.println("This is second subclass");
}
}
public class abstractclassPro28 {

public static void main(String[] args) {
child2 c1 = new child2();
c1.display();
c1.message();

}
}