package lv.rvt;
import java.util.*;


class Exercise5 {
    public static void main(String[] args) {
      int[] val = {0, 1, 2, 3}; 
      int temp;
  
      System.out.print("Original Array: ");
      for (int v : val) {
        System.out.print(v + " ");
      }
      System.out.println();
  
      int n = val.length;
      for (int i = 0; i < n / 2; i++) {
        temp = val[i];
        val[i] = val[n - 1 - i];
        val[n - 1 - i] = temp;
      }
  
      System.out.print("Reversed Array: ");
      for (int v : val) {
        System.out.print(v + " ");
      }
      System.out.println();
    }
  }
  
  

      
    