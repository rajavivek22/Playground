#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
    int temp=n;
    int arm=0;
    int c=0;
  while(temp!=0)
  {
    c++;
    temp/=10;
  }
  temp=n;
    while(temp!=0)
    {
      int digit=temp%10;
      arm+=power(digit,c);  
      temp/=10;
    }
  //std::cout<<arm<<" "<<n;
  if(arm==n)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}