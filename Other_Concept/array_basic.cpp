#include <iostream>
using namespace std;
int main() {
// already ready array
int arr[5]={88,22,55,22,54};

// user enter array 1
int user_arr1[3];
user_arr1[0]=24;
user_arr1[1]=34;
user_arr1[2]=98;

// user enter array 2
int user_arr2[6];
for(int i=0;i<6;i++){

  cin>>user_arr2[i];
}
// for acceessing all array
for(int i=0;i<5;i++){
    cout<<user_arr2[i]<<endl;
}

// for accessiing particular element
cout<<"3rd item is "<<arr[2]<<"\n";
arr[4]=88;
cout<<"5th item is "<<arr[4]<<endl;


}