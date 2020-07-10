#include<iostream>
using namespace std;
int main()
{
  int a,b,c,n,i;
  cin>>n;
  a=121;
  b=11;
  if(n==1)
  {
    cout<<"121"<<" ";
  }
  else
  {
    cout<<"121"<<" ";
    for(i=1;i<n;i++)
    {
      b=b+4;
      c=b*b;
      cout<<c<<" ";
    }
  }
  return 0;

}
