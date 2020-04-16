#include<iostream>
#include<string>
int main() 
{ 
//Type your code here
  std::string s;
  std::getline(std::cin,s);
  for(std::string::reverse_iterator
      i=s.rbegin();i<s.rend();i++)
    std::cout<<*i;
  
}