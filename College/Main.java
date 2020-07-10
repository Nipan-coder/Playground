#include<iostream>
using namespace std;
struct st
{
  char name[100];
  char city[100];
  int establishmentYear;
  float passPercentage;
};
int main()
{
  int n,i,j;
  cout<<"Enter the number of colleges";
  cin>>n;
  struct st c[n];
  for(i=1;i<=n;i++)
  {
    std::cout<<"\nEnter the details of college "<<i;
    std::cout<<"\nEnter name";
    std::cin>>c[i].name;
    std::cout<<"\nEnter city";
    std::cin>>c[i].city;
    std::cout<<"\nEnter year of establishment";
    std::cin>>c[i].establishmentYear;
    std::cout<<"\nEnter pass percentage";
    std::cin>>c[i].passPercentage;
  }
  std::cout<<"\nDetails of colleges";
  for(i=1;i<=n;i++)
  {
    std::cout<<"\nCollege:"<<i;
    std::cout<<"\nName:"<<c[i].name<<"\nCity:"<<c[i].city<<"\nYear of establishment:"<<c[i].establishmentYear;
    std::cout<<"\nPass percentage:"<<c[i].passPercentage;
  }
  return 0;
}