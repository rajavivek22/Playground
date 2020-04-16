#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs,sa,sd,ss,aa,ad,as;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  fa=fa-fa*fd/100+fs;
  sa=sa-sa*sd/100+ss;
  //cout<<aa<<" "<<ad<<" "<<as<<" ";
  aa=aa-aa*ad/100+as;
  cout<<"In Flipkart Rs."<<fa<<"\n";
  cout<<"In Snapdeal Rs."<<sa<<"\n";
  cout<<"In Amazon Rs."<<aa<<"\n";
  if(fa<=sa)
  {
    if(fa<=aa)
    {
      cout<<"He will prefer Flipkart";
    }
    else
    {
      cout<<"He will prefer Amazon";
    }
  }
  else
  {
    if(sa<=aa)
    {
      cout<<"He will prefer Snapdeal";
    }
    else
    {
      cout<<"He will prefer Amazon";
    }
  }
}