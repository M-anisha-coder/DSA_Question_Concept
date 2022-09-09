#include <iostream>
using namespace std;
// function for linear search
int linear_search( int arr[] ,int n,int target){
    for (int i=0;i<n;i++){
        if(arr[i]==target){
         return i;
         
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
int x=linear_search(arr,n,target);
cout<<x;
}
