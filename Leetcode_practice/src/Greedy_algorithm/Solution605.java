package Greedy_algorithm;
//种花问题
//P.S：创建文件/包时注意命名规则！不能有空格！数字不能开头！
public class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int j=0;j<flowerbed.length;j++){
            if (flowerbed[0]==flowerbed[1]&&flowerbed[0]==0){
                flowerbed[0]=1;
                count++;
            }
            if (flowerbed[flowerbed.length-1-1]==flowerbed[flowerbed.length-1]&&flowerbed[flowerbed.length-1]==0){
                flowerbed[flowerbed.length-1]=1;
                count++;
            }
            if(flowerbed[j-1]==flowerbed[j]&&flowerbed[j]==flowerbed[j+1]&&flowerbed[j]==0){
                count++;
                flowerbed[j]=1;
            }
        }
        if (count==n){
            return true;
        }else {
            return false;
        }
    }
}
/*
思路基本一致，但是我的写法过于累赘
 */
/*
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == length-1 || flowerbed[i+1] == 0)){
                n--;
                //把花种上
                flowerbed[i] = 1;
            }
            if (n <= 0){
                return true;
            }
        }
        return false;
    }
}

 */
