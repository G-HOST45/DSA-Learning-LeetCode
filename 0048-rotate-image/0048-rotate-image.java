class Solution {
    public void rotate(int[][] arr1) {
       
      for (int i = 0; i < arr1.length; i++) {

        for (int j = i+1; j < arr1[i].length; j++) {
          int  t=arr1[i][j];
            arr1[i][j]=arr1[j][i] ;
            arr1[j][i]=t;
        }   
        rev(arr1[i]); 
        }  
        
    }
    public void rev(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
}