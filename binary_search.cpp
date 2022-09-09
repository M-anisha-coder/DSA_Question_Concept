#include <iostream>
using namespace std;
// note for binary search array must be sorted
// function for linear search
int binary_search( int arr[] ,int n,int target){
   int start=0;
   int end=n;
   while(start<=end){   // loop till start cross end
     int  mid=(start+end)/2;
      if(target>arr[mid]) {
          start=mid+1;
      }
    else if(arr[mid]==target){
        return mid;
    }
      else{
          end=mid-1;
      }
   }
  return -1;
   
}

int main() {
    int n ,target;
    cin>>n;
    cin>>target;
    int arr[n];
    for (int i=0;i<n;i++){
        cin>>arr[i];
    }
   

// calling linear search
int x=binary_search(arr,n,target);
cout<<x;
}
