#include <iostream>
using namespace std;
int main() {
    int n;
    cin>>n;
    int arr[n];
    for (int i=0;i<n;i++){
        cin>>arr[i];
    }
 for(int i=0;i<n-1;i++)  { //traversing whole array
     for(int j=i+1;j<n;j++)    {
    // traversing unsorted array 
    //if i=0 then j traverse from 1 to n 
    //if i=1 then j traverse from 2 to n 
    //if i=2 then j traverse from 3 to n 
    if(arr[j]<arr[i]){       
          int temp;
         temp= arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
      }

     }   
 }

for(int k=0;k<n;k++){
    cout<<arr[k]<<endl;
}

}
