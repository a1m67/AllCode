#include <bits/stdc++.h>
using namespace std;
void mergeSort(int a[],int reg[],int start,int end){
	if (start>=end)
	{
		return;
	}
	int len= end-start;
	int mid= (len>>1)+start;
	int start_1=start,end_1=mid;
	int start_2=mid+1,end_2=end;
	mergeSort(a,reg,start_1,end_1);
	mergeSort(a,reg,start_2,end_2);
	int k =start;
	while(start_1<=end_1&&start_2<=end_2){
		reg[k++] = a[start_1]<a[start_2]?a[start_1++]:a[start_2++];
	}
	while(start_1<=end_1){
		reg[k++]=a[start_1++];
	}
	while(start_2<=end_2){
		reg[k++]=a[start_2++];
	}
	for (int i = start; i <= end; i++)
	{
		a[i]=reg[i];/* code */
	}
}
void merge(int a[],const int len){
	int reg[len];
	mergeSort(a,reg,0,len-1);
}


int main(){
	int n;
	cin>>n;
	int a[20];
	for (int i = 0; i < n; ++i)
	{
		cin>>a[i];/* code */
	}

	for (int i = 0; i < n; ++i)
	{
	cout<<a[i]<<" ";	/* code */
	}
	cout<<"\n";
	merge(a,n);
	for (int i = 0; i < n; ++i)
	{
	cout<<a[i]<<" ";	/* code */
	}
	return 0;
}