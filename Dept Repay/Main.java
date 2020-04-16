#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,n,r;
  cin>>p>>r>>n;
  float si=p*n*r/100;
  float amount=p+si;
  float intr=si*2/100;
  float final_amount=amount-intr;
  cout<<si<<"\n";
  cout<<amount<<"\n";
  cout<<intr<<"\n";
  cout<<final_amount;
}
