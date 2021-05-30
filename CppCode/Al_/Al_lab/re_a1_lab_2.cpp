#include <bits/stdc++.h>
using namespace std;

void mergeSort(int arr[],int reg[],int start,int end){
	if(start>=end)return;
	int len = end - start;
	int mid = (len>>1)+start;
	int start1=start,end2=end;
	int start2=mid+1,end1=mid;
	mergeSort(arr,reg,start1,end1);
	mergeSort(arr,reg,start2,end2);
	int k =start;
	while( start1<=end1 && start2<=end2){
		reg[k++] = arr[start1] < arr[start2] ? arr[start1++]:arr[start2++];
	}
	while(start1 <= end1){
		reg[k++] = arr[start1++];
	}
	while(start2 <= end2){
		reg[k++] = arr[start2++];
	}
	for (int i = start; i <= end; ++i)
	{
		arr[i]=reg[i];
	}
}
void merge(int arr[],const int len){
	int reg[len];
	mergeSort(arr,reg,0,len-1);
}


int main(){
	int n;
	cin>>n;
	int a[20];
	for (int i = 0; i < n; ++i)
	{
		cin >>a[i];
	}

	for(int i=0;i<n;i++){
		cout<<a[i]<<" ";
	}
	merge(a,n);
	cout<<"\n";
	for (int i = 0; i < n; ++i)
	{
	cout<<a[i]<<" ";	/* code */
	}

}