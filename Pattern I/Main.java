#include<iostream>
using namespace std;
int main()
{
  int num;
  cin>>num;
  for(int i=1;i<=4;i++)
  {
    for(int j=1;j<=i;j++)
    {
      cout<<num;
    }
    cout<<endl;
    num++;
  }
  num--;
  for(int i=4;i>=1;i--)
  {
    for(int j=i;j>=1;j--)
    {
      cout<<num;
    }
    cout<<endl;
    num--;
  }
  return 0;
}
