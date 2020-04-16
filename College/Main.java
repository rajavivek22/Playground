#include<iostream>
using namespace std;
struct col
{
  char name[100];
  char city[100];
  int establishmentYear;
  float passPercentage;
};
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of colleges";
  cin>>n;
  struct col a[n];
  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name";
    cin>>a[i].name;
    cout<<"\nEnter city";
    cin>>a[i].city;
    cout<<"\nEnter year of establishment";
    cin>>a[i].establishmentYear;
    cout<<"\nEnter pass percentage";
    cin>>a[i].passPercentage;
  }
  cout<<"\nDetails of colleges";
  for(int i=0;i<n;i++)
  {
    cout<<"\nCollege:"<<i+1;
    cout<<"\nName:"<<a[i].name;
    cout<<"\nCity:"<<a[i].city;
    cout<<"\nYear of establishment:"<<a[i].establishmentYear;
    cout<<"\nPass percentage:"<<a[i].passPercentage;
  }
}