#include <bits/stdc++.h>
using namespace std;
const int N=15;
int w[N]={0,2,3,4,5};
int v[N]={0,3,4,5,6};
int bagV=8;
int n=4;
int dp[N][N];
void findMax(){
	for (int i = 1; i <=n ; i++)
	{
		for (int j = 1; j <= bagV; ++j)
		{
			if(j<w[i]){
				dp[i][j]=dp[i-1][j];
			}
			else{
				dp[i][j]=max(dp[i-1][j],dp[i-1][j-w[i]]+v[i]);
			}
		}
	}
}
int main(){
	findMax();
	for (int i = 0; i < N; ++i)
	{
		for(int j=0;i<N;++i){dp[i][j]=0;}/* code */
	}
	for (int i = 1; i <= n; i++)
	{
		for (int j = 1; j <= bagV; j++)
		{
			cout<<dp[i][j]<<" ";
		}
		cout<<"\n";
	}
	return 0;
}


// void findWhat(int i,int j){
// 	if(i>=0){
// 		if(dp[i][j]==dp[i][j-1]){
// 			item[i]=0;
// 			findWhat(i-1,j);
// 		}
// 		else if(j-w[i]>=0&&dp[i][j]==dp[i-1][j-w[i]]+v[i]){
// 			item[i]=1;
// 			findWhat(i-1,j-w[i]);
// 		}
// 	}
// }