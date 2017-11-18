package com.others;

public class Main {

 public static void main(String[] args) {
  System.out.println("abc".length());

 }

 private int calculateMain(int[] a) {
  System.out.println(partition(a, 0, a.length - 1));
  return partition(a, 0, a.length - 1);

 }

 int partition(int arr[], int low, int high) {
  int pivot = arr[low];
  int i = low; // index of smaller element
  int count=0;
  for (int j = low; j <= high; j++) {
   // If current element is smaller than or
   // equal to pivot
   
   if (arr[j] <= pivot) {
    i++;
    i+=count;
    count=0;

   } else {
    int temp = pivot;
    pivot = arr[j];
       arr[j] = temp;
    count++;

   }
  }

  return i;
 }

}