#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int i,j,a[n][m];
  int sum;
  for(i=0;i<n;i++)
  {
    sum=0;
    for(j=0;j<m;j++)
    {
      cin>>a[i][j];
      sum+=a[i][j];
    }
    cout<<sum<<"\n";
  }
}