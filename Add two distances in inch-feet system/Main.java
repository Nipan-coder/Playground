#include <iostream>
using namespace std;
struct Distance{
int feet;
float inch;
}
d1 , d2, sum;
int main()
{
  std::cin>>d1.feet;
  std::cin>>d1.inch;
  std::cin>>d2.feet;
  std::cin>>d2.inch;
  sum.feet=d1.feet+d2.feet;
  sum.inch=d1.inch+d2.inch;
  if(sum.inch>12)
  {
    ++sum.feet;
    sum.inch -= 12;
  }
  std::cout<<sum.feet<<"'"<<"-"<<sum.inch<<'"';
  return 0;
}