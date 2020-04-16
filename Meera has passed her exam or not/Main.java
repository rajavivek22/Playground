#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int k=0;
  int m;
  cin>>m;
  for(int i=0;i<n;i++)
  {
    if(m==a[i])
      k=1;
  }
  if(k==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}