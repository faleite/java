class Solution{
  public static int FindMaxConsecutiveOnes(int[] array){
    int result = 0;
    int sum = 0;
    for (int num : array){
      if (num == 1)
        sum++;
      else
        sum = 0;
      result = sum > result ? sum : result;
    }
    return (result);
  }

  public static void main(String[] args){
    int[] array = {1,1,0,1,1,1};
    int[] array1 = {1,0,1,1,0,1};
    System.out.println(FindMaxConsecutiveOnes(array1));
  }
}
