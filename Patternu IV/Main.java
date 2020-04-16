#include <iostream>
using namespace std;
int main() {
    // Type your code 
  int n;
  cin>>n;
  int i,j,k=0;
  int c=1;
  int temp=c;
  for(i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      
      temp=c;
      for(j=1;j<=n;j++)
      {
        
        if(j==n)
        {c+=1;
          temp=c;}
          cout<<temp;
      }
      cout<<"\n";
    }
    else
    {
      temp=c+1;
      cout<<temp;
      for(j=2;j<=n;j++)
      {
        cout<<c;
      }
      c=temp;
      cout<<"\n";
    }
  }
}