#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  int d1=0;
  int d2=0;
  for(int i=0;i<n;i++)
  {
    d1+=a[i][i];
  }
  for(int i=0;i<n;i++)
  {
        d2+=a[i][n-i-1];
  }
  if(d1==d2)
    cout<<"Yes";
  else
    cout<<"No";
}