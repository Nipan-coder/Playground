#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,b;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    b=i*i;
    if(b%2==0)
      cout<<b-2<<" ";
    else
      cout<<b-1<<" ";
  }
  return 0;
}

