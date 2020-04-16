#include<iostream>
using namespace std;
int compute(int n)
{
  if(n<=9)
    return n;
  else
  {
    int add=0;
    while(n)
    {
      add+=n%10;
      n/=10;
    }
    compute(add);
  }
}
int main()
{
  int n;
  cin>>n;
  cout<<compute(n);
}