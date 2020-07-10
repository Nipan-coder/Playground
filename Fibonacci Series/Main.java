#include<iostream>
using namespace std;
int fibo(int);
int main()
{
  int n,result;
  cin>>n;
  result=fibo(n-1);
  cout<<"The term "<<n<<" in the fibonacci series is "<<result;
  return 0;
}
int fibo(int n)
{
  if(n==0)
  {
    return 0;
  }
  else if(n==1)
  {
    return 1;
  }
  else
  {
    return(fibo(n-1)+fibo(n-2));
  }
}
