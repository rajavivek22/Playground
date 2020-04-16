#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int temp=n;
  int m=1;
  int c=0;
  while(temp--)
  {
    c+=2*m;
    m++;
  }
  int i,j;
  i=1;
  j=c;
  int k;
  temp=0;
  while(n>0)
  {
    for(k=0;k<temp;k++)
    {
      cout<<"-";
    }
    for(k=0;k<n;k++)
    {
      if(k!=0)
        cout<<"*";
      cout<<i;
      i++;
    }
    cout<<"*";
    j-=n;
    for(k=0;k<n;k++)
    {
      if(k!=0)
        cout<<"*";
      j++;
      cout<<j;
    }
    j-=n;
    cout<<"\n";
    n--;
    temp+=2;
  }
      
   
}