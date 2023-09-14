class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count =0;
        int i =0;
        while(i<flowerbed.length){
        System.out.println(i);
            if(flowerbed.length==1 &&
                flowerbed[i]==0){
                count = count+1;    
            }

        else if(flowerbed[i]==0){

            if(i==0 || i == flowerbed.length-2){
                if(flowerbed[i]==0 && 
                flowerbed[i+1]==0){
                count=count+1;
                }
                
            } else if(i==flowerbed.length-1){
                
            if(flowerbed[i]==0 && flowerbed[i-1]==0){
                count=count+1; 
            } 
                
             } else if(flowerbed[i]==0 && 
                         flowerbed[i-1]==0 &&
                         flowerbed[i+1]==0){
                count=count+1; 
                
            }
        }
        i = i+2;
        }
        System.out.println(count);
        return count>=n;

    
    }
}
