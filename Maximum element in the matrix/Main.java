#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int a[n][m];
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
      cin>>a[i][j];
  int max=a[0][0];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      if(max<a[i][j])
        max=a[i][j];
    }
  }
  cout<<"The maximum element is "<<max;
}