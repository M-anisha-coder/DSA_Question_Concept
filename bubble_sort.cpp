#include <iostream>
using namespace std;
int main() {
    int n;
    cin>>n;
    int arr[n];
    for (int i=0;i<n;i++){
        cin>>arr[i];
    }
int k=1;

while(k<n){
    // bubble sort always requires n-1 iteration to get sorted array
    //when 1st iteration k=1 then i=0 to n-1
    //when 2nd iteration k=2 then i=0 to n-2
    //when 3rd iteration k=3 then i=0 to n-3
    //when 4th iteration k=4 then i=0 to n-4

    for(int i=0;i<n-k;i++){
        if(arr[i]>arr[i+1]){
        int temp;
        temp =arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
        }
      
    }
      k=k+1;
}

for(int k=0;k<n;k++){
    cout<<arr[k]<<endl;
}

}
