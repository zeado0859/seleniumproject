

package com.mycompany.demo;


public class Demo {
    public void readArrayOddSum(){
int data[]={45,55,65,12,33,78};
int sum=0;
for(int i=0;i<data.length;i++){
    if(data [i]%2!=0){
        sum=sum+data[i];
}}
System.out.println("sum of odd number is:"+sum);
    }



    public static void main(String[] args) {
         Demo oj=new Demo();
         oj.readArrayOddSum();
    }
}
