#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int v=0,c=0,w=0,d=0,sy=0;
  string s;
  getline(cin,s);
  //cout<<s<<"\n";
  for(int i=0;i<s.length();i++)
  {
    if(s.at(i)=='a' || s.at(i)=='e' || s.at(i)=='i' || s.at(i)=='o' || s.at(i)=='u' || s.at(i)=='A' || s.at(i)=='E' || s.at(i)=='I' || s.at(i)=='O' || s.at(i)=='U')
    {
      v++;
    }
    else if((s.at(i)>'a' && s.at(i)<='z')||(s.at(i)>'A' && s.at(i)<='Z'))
    {
      c++;
    }
    else if(s.at(i)==' ')
    {
      w++;
    }
    else if(s.at(i)>='0' && s.at(i)<='9')
    {
      d++;
    }
    else
    {
      sy++;
    }
  }
  cout<<"Vowels:"<<v<<"\nConsonants:"<<c<<"\nWhite Spaces:"<<w<<"\nDigits:"<<d<<"\nSymbols:"<<sy;
}