import java.util.*;
class GuessNum
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
int number = (int)(Math.random()*100);    // Generates a random number between 1 and 100.
int unum=0;
do
{
System.out.println("Guess the number:");
int unum= sc.nextInt();

if(usernum==number)                      // Checks if unum is >= number
{
System.out.println("Correct");
break;
}

else if (isernum>number)
{
  System.out.println("Your num is greater");
}
else 
{
  System.out.println("Your num is less");
}
}
while(unum>=0);                           // While loop goes on untill unu is >=0
  
  }
System.out.println("The num was" + number);
}
}

