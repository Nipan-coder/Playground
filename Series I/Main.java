#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  cin>>n;
  double n1=0.5;
  for(int i=0;i<n;i++)
  {
    if(i==0)
    {
      cout<<n1<<" ";
      continue;
    }
    else
    {
      double n2=pow(3,i-1);
      double n3=n2+n1;
      n1=n3;
      cout<<n3<<" ";
    }
  }
  return 0;
}
