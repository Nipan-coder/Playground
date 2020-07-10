#include<iostream>
#include<bits/stdc++.h> 
#include<string>
using namespace std;
struct Student
{
  char name[30];
  char department[20];
  int yearOfStudy;
  float cgpa;
};

int main()
{
  int n,i,j;
  cout<<"Enter the number of students\n";
  cin>>n;
  char x[n][30];
  char t[30];
  Student s[n];
  for(i=0;i<n;i++)
  {
    std::cout<<"Enter the details of student "<<i+1<<endl;
    std::cout<<"Enter name\n";
    std::cin.ignore();
    std::cin.getline(s[i].name,30);
    strcpy(x[i], s[i].name);
    std::cout<<"Enter department\n";
    std::cin.getline(s[i].department,20);
    std::cout<<"Enter year of study\n";
    std::cin>>s[i].yearOfStudy;
    std::cout<<"Enter cgpa\n";
    std::cin>>s[i].cgpa;
  }  
  for(i=0;i<n;i++)
  {
    for(j=0;j<n-i-1;j++)
    {
      if(strcmp(x[j],x[j+1])>0)
      {
        strcpy(t, x[j]);
        strcpy(x[j], x[j+1]);
        strcpy(x[j+1], t);
      }
    }
  }
  std::cout<<"Details of students\n";
  for(int i=0;i<n;i++)
  {
    for(int j=0; j<n; j++)
    {
      if(strcmp(x[i],s[j].name)==0)
      {
        std::cout<<"Student "<<i+1<<endl;
        std::cout<<"Name:"<<s[j].name<<endl;
        std::cout<<"Department:"<<s[j].department<<endl;
        std::cout<<"Year of study:"<<s[j].yearOfStudy<<endl;
        std::cout<<"CGPA:"<<setprecision(2)<<s[j].cgpa<<endl;
        break;
      }
    }
  }
  return 0;
}