#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int c=n+m;
  int d=n*m;
  int f=d-c;
  if(f%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}