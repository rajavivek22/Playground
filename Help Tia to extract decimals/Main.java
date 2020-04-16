#include<iostream>
#include<string>
int main() 
{ 
	std::string fnum;
	//Type your code here
  std::cin>>fnum;
  int j=0;
  std::cout<<"Floating part is : ";
    for(std::string:: iterator
        i=fnum.begin();i<fnum.end();i++)
    {
      
      
        if(*i=='.')
        { j=1;continue;}
      if(j==1)
        std::cout<<*i;
      
    }
 
      
}