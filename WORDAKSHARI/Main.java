#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s[10];
  int d=0;
  for(d=0;;d++)
  {
    cin>>s[d];
    if(s[d]=="####")
      break;
  }
  for(int i=0;i<d;i++)
  {
    cout<<s[i]<<"\n";
    int n=s[i].size();
    if(s[i][n-1]!=s[i+1][0])
    {
      i+=1;
    }
  }
}