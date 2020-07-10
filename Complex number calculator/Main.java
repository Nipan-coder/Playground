#include<iostream>
int main()
{
  int a,b,c,d,n;
  std::cin>>n>>a>>b>>c>>d;
  switch(n)
  {
    case 1: std::cout<<(a+c)<<"+"<<(b+d)<<"i";
      break;
    case 2: std::cout<<(a-c)<<"+"<<(b-d)<<"i";
      break;
    case 3: std::cout<<((a*c)-(b*d))<<((b*c)+(a*d))<<"i";
      break;
    default: std::cout<<"Invalid choice";
  }
  return 0;
}
