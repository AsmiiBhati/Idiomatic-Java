int reverse = 0;
int original = num;
while(num>0)
{
    int digit = num%10;
    reverse = reverse*10+digit;
    num /=10;
}
int left = 0;
int right = str.length() -1;
boolean palindrome = true;
while(left<right)
{
    if(str.chatAt(left)!=str.charAt(right))
    {
        palindrome = false;
        break; 
    }
    left++;
    right--;
}
int a = 0; int b = 1;
for(int i=0;i<n;i++)
{
    int next = a+b;
    a=b;
    b=next;
}
if (n==0 || n==1) return 1;
int fact = 1;
for(int i =1;i<=n;i++)
{
    fact = fact*i;
}
return fact;
int reverse = 0;
while(num!=0)
{
    int digit = num%10;
    reverse = reverse*10+digit;
    num = num/10;
}
return reverse;
String str = new StringBuilder(str).reverse().toString();
return reversed;

int temp = num;
int total = 0;
while(temp!=0)
{
    temp/=10;
    total++;
}
while(num!=0)
{
    int digit = num%10;
    int sum += Math.pow(digit,total);
    num /= 10;
}