class Pattern
{
public static void printTriangle(int n)//Method to print pattern
{
int i,j;
//outer loop to handle the no of rows
for(i=0;i<=n;i++)
{
//Inner loop to handle number of space
for(j=n-i;j>=1;j--)
{
System.out.print(" ");
}
for(j=0;j<=i;j++)
{
System.out.print(" * ");
}
//Ending line after each row
System.out.println();
}
}
public static void main(String args[])
{
int n=5;
printTriangle(n);//Calling method 
}
}
