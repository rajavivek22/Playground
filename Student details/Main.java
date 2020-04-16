#include<iostream>
#include<string.h>
using namespace std;
struct stud
{
  string name;
  string dept;
  int year;
  float cgpa;
};
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of students";
  cin>>n;
  struct stud a[n],temp;
  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of student "<<i+1;
    cout<<"\nEnter name";
    getline(cin,a[i].name);
    getline(cin,a[i].name);
    cout<<"\nEnter department";
    cin>>a[i].dept;
    cout<<"\nEnter year of study";
    cin>>a[i].year;
    cout<<"\nEnter cgpa";
    cin>>a[i].cgpa;
  }
  for(int i=0;i<n;i++)
  {
    for(int j=i;j<n;j++)
    {
      if(a[i].name>a[j].name)
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
  }
  cout<<"\nDetails of students";
  for(int i=0;i<n;i++)
  {
    cout<<"\nStudent "<<i+1;
    cout<<"\nName:"<<a[i].name;
    cout<<"\nDepartment:"<<a[i].dept;
    cout<<"\nYear of study:"<<a[i].year;
    cout<<"\nCGPA:"<<a[i].cgpa;
  }
    
}