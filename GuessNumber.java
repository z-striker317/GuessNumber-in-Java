import java.util.*;
class GuessNum
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
int num = (int)(Math.random()*100);
int unum=0;
do
{
System.out.println("Guess the number:");
int unum= sc.nextInt();

if(usernum==num)
{
System.out.println("Correct");
break;
}

else if (isernum>num)
{

}
else 
{
  System.out.println("Your num is less");
}
}
while(unum>=0);
  
  }
System.out.println("The num was" + num);
}
}

