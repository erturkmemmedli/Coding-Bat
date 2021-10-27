/* countEvens */
public int countEvens(int[] nums) {
  int count=0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i]%2==0) count++;
  }
  return count;
}

/* bigDiff */
public int bigDiff(int[] nums) {
  int max = nums[0];
  int min = nums[0];
  for (int i=0; i<nums.length; i++) {
    min = Math.min(min, nums[i]);
    max = Math.max(max, nums[i]);
  }
  return max-min;
}

/* centeredAverage */
public int centeredAverage(int[] nums) {
  Arrays.sort(nums);
  if (nums.length%2==1) return nums[nums.length/2];
  return (nums[nums.length/2-1]+nums[nums.length/2])/2;
}

/* sum13 */
public int sum13(int[] nums) {
  int count = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i]!=13) count += nums[i]; 
    else if (nums[i]==13 && i<= nums.length-2 && nums[i+1]!=13) count -= nums[i+1];
  }
  return count;
}

/* sum67 */
public int sum67(int[] nums) {
  int count = 0;
  boolean stop = false;
  for (int i=0; i<nums.length; i++) {
    if (nums[i]==6) stop = true;
    if (stop == false) count += nums[i];
    if (stop == true && nums[i]==7) stop = false;
  }
  return count;
}

/* has22 */
public boolean has22(int[] nums) {
  for (int i=0; i<nums.length-1; i++) {
    if (nums[i]==2 && nums[i+1]==2) return true;
  }
  return false;
}

/* lucky13 */
public boolean lucky13(int[] nums) {
  for (int i=0; i<nums.length; i++) {
    if (nums[i]==1 || nums[i]==3) return false;
  }
  return true;
}

/* sum28 */
public boolean sum28(int[] nums) {
  int count = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i]==2) count += nums[i];
  }
  return count == 8;
}

/* more14 */
public boolean more14(int[] nums) {
  int count1 = 0;
  int count4 = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i]==1) count1++;
    if (nums[i]==4) count4++;
  }
  return count1>count4;
}

/* fizzArray */
public int[] fizzArray(int n) {
  int[] array = new int[n];
  int count = 0;
  for (int i=0;i<n;i++) {
    array[i] = count;
    count++;
  }
  return array;
}

/* only14 */
public boolean only14(int[] nums) {
  for (int i=0; i<nums.length; i++) {
    if (nums[i]!=1 && nums[i]!=4) return false;
  }
  return true;
}

/* fizzArray2 */
public String[] fizzArray2(int n) {
  String[] array = new String[n];
  int count = 0;
  for (int i=0;i<n;i++) {
    array[i] = String.valueOf(count);
    count++;
  }
  return array;
}

/* no14 */
public boolean no14(int[] nums) {
  for (int i=0; i<nums.length; i++) {
    if (nums[i]==1) {
       for (int j=0; j<nums.length; j++) {
         if (nums[j]==4) return false;
       }
       return true;
    }
  }
  return true;
}

/* isEverywhere */
public boolean isEverywhere(int[] nums, int val) {
  if (nums.length<2) return true;
  for (int i=0; i<nums.length-1; i++) {
    if (nums[i]!=val && nums[i+1]!=val) return false;
  }
  return true;
}

/* either24 */
public boolean either24(int[] nums) {
  for (int i=0; i<nums.length-1; i++) {
    if (nums[i]==2 && nums[i+1]==2) {
      for (int j=0; j<nums.length-1; j++) {
        if (nums[j]==4 && nums[j+1]==4) return false;
      }
      return true;
    }
    else if (nums[i]==4 && nums[i+1]==4) {
      for (int j=0; j<nums.length-1; j++) {
        if (nums[j]==2 && nums[j+1]==2) return false;
      }
      return true;
    }
  }
  return false;
}

/* matchUp */
public int matchUp(int[] nums1, int[] nums2) {
  int count = 0;
  for (int i=0; i<nums1.length; i++) {
  if (Math.abs(nums1[i]-nums2[i])==1 || Math.abs(nums1[i]-nums2[i])==2)
    count++;
  }
  return count;
}

/* has77 */
public boolean has77(int[] nums) {
  for (int i=0; i<nums.length-1; i++) {
    if (nums[i]==7 && nums[i+1]==7 || (nums[i]==7 && nums[i+2]==7))
      return true;
    if (nums[nums.length-1]!=7) return false;
  }
  return false;
}

/* has12 */
public boolean has12(int[] nums) {
  for (int i=0; i<nums.length; i++) {
    if (nums[i]==1) {
       for (int j=i; j<nums.length; j++) {
         if (nums[j]==2) return true;
       }
       return false;
    }
  }
  return false;
}

/* modThree */
public boolean modThree(int[] nums) {
  for (int i=0; i<nums.length-2; i++) {
    if (nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0) return true;
    if (nums[i]%2==1 && nums[i+1]%2==1 && nums[i+2]%2==1) return true;
  }
  return false;
}

/* haveThree */
public boolean haveThree(int[] nums) {
  int count = 0;
  int a = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i]==3) count++;
  }
  if (count==3) {
    for (int j=0; j<nums.length-1; j++) {
      if (nums[j]==3 && nums[j+1]==3) a++;
    }
    if (a==0) return true;
    return false;
  }
  return false;
}

/* twoTwo */
public boolean twoTwo(int[] nums) {
  boolean stuff = true;
  for (int i=0; i<nums.length; i++) {
    if (nums[i]==2) stuff = false;
    if (i>0 && nums[i]==2 && nums[i-1]==2) stuff = true;
  }
  return stuff;
}
