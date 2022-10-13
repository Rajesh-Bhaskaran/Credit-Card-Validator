import java.util.Scanner;
class Credit_Card_Validator
{
public static void main(String [] args)
{
int [] ar = new int[16];
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Credit Card Number");
for(int i=0;i<ar.length;i++)
{
ar[i]=sc.nextInt();
}
Credit_Card_Validator validator_machine = new Credit_Card_Validator();
validator_machine.checking_credit_card(ar);
}
void checking_credit_card(int [] ar)
{
int total=0;
for(int i=0;i<ar.length;i=i+2)
{
ar[i]=ar[i]*2;
if(ar[i]>9)
{
int sum=0;
while(ar[i]>0)
{
int rem=ar[i]%10;
sum=rem+sum;
ar[i]=ar[i]/10;
}
ar[i]=sum;
}
}
for(int i=0;i<ar.length;i++)
{
total=ar[i]+total;
}
if(total%10==0)
System.out.println("Credit Card is Valid");
else
System.out.println("Credit Card is Not Valid");
//System.out.println(total);
/*for(int i=0;i<ar.length;i++)
{
System.out.print(ar[i]+" ");
}*/
}

}
