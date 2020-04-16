#include <iostream>
int main()
{
char str[100], rev[100];     
int count = 0, i;    
//Your code goes here   
std::cin.getline(str,100);
while(1)
{
  if(str[count]=='\0')
    break;
  count++;
}
for(i=0;i<count;i++)
  rev[count-i-1]=str[i];
  
  
std::cout<<rev;
}