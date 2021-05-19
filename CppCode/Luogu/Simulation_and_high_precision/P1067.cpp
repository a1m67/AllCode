#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
	int n;
	cin>>n;
	int m = n;
	int a[102];
	for (int i = 0; i < n; ++i){
		cin>>a[i];
	}
	for (int i = 0; i < n+1; ++i){
		if (a[i]==0){
			cout<<"";
		}
		else if(a[i]<0){
			if (a[i]==-1){
				printf("-x^%d\n",m);
			}
			else {
				printf("%dx^%d\n",a[i],m);
			}
		}
		else{
			if (i==0)
			{
				printf("%d^x%d\n",a[i],m);
			}
		}
	}
	return 0;
}