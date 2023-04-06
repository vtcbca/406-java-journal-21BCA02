/*Write a java application which accepts 10 names of student and their age. Sort names and
age in descending order. (Using Array)*/
import java.util.*;
class StudentDetail{
    public static void main(String args[])
	{
        String StdName[]={"Nandini","Akash","Aksh","Palak","Drasti","Mansi","Shweta","Vansh","Vedant","Arsh"};
        int age[]={19,24,23,19,17,15,19,18,14,10};
        int n=9;
        String temp;
        for (int i=0; i<=n;i++) 
		{
            for (int j=i+1;j<=n;j++)
				{               
                // to compare one string with other strings
                if (StdName[i].compareTo(StdName[j]) > 0)					
				{
                    // swapping
                    temp = StdName[i];
                    StdName[i] = StdName[j];
                    StdName[j] = temp;
                }
            }
        }
        for(int i=0;i<=n;i++)
		{
            for(int j=i+1;j<=n;j++)
			{
                //to set the age in descnding order
                int temp1;
                if(age[i]>age[j])
				{
                    temp1=age[i];
                    age[i]=age[j];
                    age[j]=temp1;
                }
            }
        }
        System.out.println("Names & Age in descnding order.");
        System.out.println("Names\t\t\tAge");
        System.out.println("====================  \t====================");
        for (int i = n; i >=0; i--) 
		{
            System.out.println(StdName[i]+"\t\t\t"+age[i]);
        }

    }
}
