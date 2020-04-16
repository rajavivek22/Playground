#include<iostream>
using namespace std;
int power(int a,int n)
{
  if(n==1)
    return a;
  else
    return a*power(a,n-1);
}
int main()
{
  //Type your code here.
  int a;
  int n;
  cout<<"Enter the value of a\n";
  cout<<"Enter the value of n\n";
  cin>>a>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
}