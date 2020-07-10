#include<iostream>
using namespace std;
int power(int m,int n)
{
    int j=1,i;
    for(i=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int temp,sum=0;
  temp=n;
  int rem;
  int digits=0;
  while(temp>0)
  {
    digits++;
    temp/=10;
  }
  temp=n;
  while(temp>0)
  {
    rem=temp%10;
    sum+=power(rem,digits);
    temp/=10;
  }
  if(sum==n)
    return 1;
  else
    return 0;
}
int main()
{
  int n;
  cin>>n;
  if(arm(n)==1)
    cout<<"Kindly proceed with encrypting";
  else
    cout<<"It is not an Armstrong number";
}

