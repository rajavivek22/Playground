#include<iostream>
using namespace std;
int printresult(int *a,int s,int n)
{
  for(int i=0;i<n;i++)
  {
    s-=*(a+i);
  }
  if(s>=0)
    return 1;
  else
    return 0;
}
int main()
{
  //Type your code here.
  int n,s;
  cin>>n>>s;
  int *a=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  int b=printresult(a,s,n);
  if(b==1)
    cout<<"YES";
  else
    cout<<"NO";
  return 0;
}