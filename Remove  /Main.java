#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  getline(cin,s);
  while(s.find("the")!=string::npos)
  {
    s.replace(s.find("the"),4,"");
  }
  cout<<s;
}