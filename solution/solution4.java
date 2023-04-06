/*Write a program that will accept two strings or two numbers from command line and create
overloaded method that add these two numbers or concate two strings.*/
class p4
{
    public void display(String s1,String s2)
	{
        System.out.println("The Concated String is:"+(s1+s2));
    }
    public void display(int a,int b)
	{
        System.out.println("The Addition of "+a+" and "+b+" is:"+(a+b));
    }
    public static void main(String args[])
	{
        p4 o=new p4();
        o.display("Nandini","Joshi");
        o.display(13,11);   
    }
}
