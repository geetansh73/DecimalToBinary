class DecimalToBinary
{
public static void main(String args[])
{
int n=6;
int binary[]=new int[32];
int i=0;
while(n>0)
{
binary[i]=n%2;
n=n/2;
i++;
}
for(int j=i-1;j>=0;j--)
{
System.out.print(binary[j]);
}
}
}
