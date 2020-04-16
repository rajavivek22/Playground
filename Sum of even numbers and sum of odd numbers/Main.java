#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int *p=(int*)calloc(n,sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(p+i);
  }
  int o=0;
  int e=0;
  for(int i=0;i<n;i++)
  {
    if(*(p+i)%2==0)
      e+=*(p+i);
    else
      o+=*(p+i);
  }
  cout<<"The sum of the even numbers in the array is "<<e;
  cout<<"\nThe sum of the odd numbers in the array is "<<o;
}