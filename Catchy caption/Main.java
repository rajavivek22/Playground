#include <cstring>
#include <iostream>
int main()
{
   //Your code goes here
  char a[1000];
  int c=0;
  std::cin.getline(a,1000);
  for(int i=0;i<strlen(a);i++)
  {
    if(a[i]==' ')
    {
      c++;
    }
  }
  if(c<10)
    std::cout<<"Caption eligible for the contest";
  else
    std::cout<<"Caption not eligible for the contest";
}