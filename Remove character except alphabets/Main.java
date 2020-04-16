#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  cin>>str;
  for(int i=0;i<str.size();i++)
  {
    if(str.at(i)>='a' && str.at(i)<='z')
    {
    }
    else if(str.at(i)>='A' && str.at(i)<='Z')
            {
            }
    else
            {
              str.erase(i,1);
      i--;
            }
   }
   cout<<str;
            
}