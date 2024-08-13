package abstractionProgram;

abstract public class A1 {
static int a=10;
int b=20;
abstract public void m1();

public void m2()
{
	System.out.println("m2() concrete method");
}
A1()
{
	System.out.println("A1() class constructor");
}
public static void m3()
{
	System.out.println("m3() from A1 class");
}
}
