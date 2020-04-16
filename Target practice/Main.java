#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int c=0;
  int b;
  while(n>0)
  {
    cin>>b;
    n-=b;
    c++;
  }
  cout<<"The number of turns is "<<c;
}