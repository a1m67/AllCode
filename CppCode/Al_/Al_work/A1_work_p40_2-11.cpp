#include<bits/stdc++.h>
using namespace std;

int solve(int n){
	int i=0;
	int count = 0;
	if(n==1)return 1;
	else{
		for (i = 2; i <= n; i++)
		{
			if(n%i==0){
				count+=solve(n/i);
			}
		}
		return count;
	}
}
int main(){
	int n;
	cin>>n;
	cout<<solve(n)<<endl;
	return 0;
}