#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  float temp=n;
  float t=sqrt(n);
  while(temp)
  {
    temp/=t;
    n+=temp;
  }
  cout<<n;
}