#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str1;
  string second;
  cin>>str1>>second;
  int k=0;
  int flag=0;
  for(string:: reverse_iterator
      i=str1.rbegin();i<str1.rend();i++)
  {
       if(*i!=second.at(k))
       flag=1;
    k++;
  }
  if(flag==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}