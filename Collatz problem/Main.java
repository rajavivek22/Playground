#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int c=0;
  cout<<n<<"\n";
  while(n!=1)
  {
    if(n%2==0)
    {
      n/=2;
    }
    else
    {
      n=3*n+1;
    }
    cout<<n<<"\n";
    c++;
  }
  cout<<c;
}