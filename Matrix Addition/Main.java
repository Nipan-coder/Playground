#include<iostream>
using namespace std;
int main()
{
     int r, c, mat1[100][100], mat2[100][100], sum[100][100], i, j;
  std::cin>>r>>c;
  for(i=0; i<r; ++i)
    for(j=0; j<c; ++j)
      std::cin>>mat1[i][j];
  for(i=0; i<r; ++i)
    for(j=0; j<c; ++j)
      std::cin>>mat2[i][j];
  for(i=0;i<r;++i)
    for(j=0;j<c;++j)
      sum[i][j]=mat1[i][j]+mat2[i][j];
  for(i=0;i<r;++i)
  {
    for(j=0;j<c;++j)
      std::cout<<sum[i][j]<<" ";
    cout<<"\n";
  }
  return 0;
}
