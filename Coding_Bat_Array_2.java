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

/* sameEnds */
public boolean sameEnds(int[] nums, int len) {
  int[] front = Arrays.copyOfRange(nums,0,len);
  int[] end = Arrays.copyOfRange(nums,nums.length-len,nums.length);
  if (Arrays.equals(front,end)) return true;
  return false;
}

/* tripleUp */
public boolean tripleUp(int[] nums) {
  for (int i=0; i<nums.length-1; i++) {
    if (i>0 && nums[i]-nums[i-1]==1 && nums[i+1]-nums[i]==1)
      return true;
  }
  return false;
}

/* fizzArray3 */
public int[] fizzArray3(int start, int end) {
  int n = end-start;
  int[] array = new int[n];
  int count = start;
  for (int i=0;i<n;i++) {
    array[i] = count;
    count++;
  }
  return array;
}

/* shiftLeft */
public int[] shiftLeft(int[] nums) {
  int[] arr = new int[nums.length];
  if (nums.length==0) return nums;
  arr[nums.length-1] = nums[0];
  for (int i=0; i<nums.length-1; i++) {
    arr[i] = nums[i+1];
  }
  return arr;
}

/* tenRun */
public int[] tenRun(int[] nums) {
  int[] arr = new int[nums.length];
  if (nums.length==0 || nums.length==1) arr = nums;
  for (int i=1; i<nums.length; i++) {
    arr[0] = nums[0];
    arr[i] = nums[i];
    if (arr[i-1]%10==0 && nums[i]%10!=0) arr[i] = arr[i-1];
  }
  return arr; 
}

/* pre4 */
public int[] pre4(int[] nums) {
  int i = 0;
  int index = 0;
  while (i < nums.length) {
    if (nums[i] == 4) {
      index = i;
      break;
    }
    else i++;
  }
  return Arrays.copyOfRange(nums,0,index);
}

/* post4 */
public int[] post4(int[] nums) {
  int i = nums.length-1;
  int index = 0;
  while (i > 0) {
    if (nums[i] == 4) {
      index = i;
      break;
    }
    i--;
  }
  return Arrays.copyOfRange(nums,index+1,nums.length);
}

/* notAlone */
public int[] notAlone(int[] nums, int val) {
  int[] arr = nums;
  for (int i=1; i<nums.length-1; i++) {
    if (nums[i] == val) {
      if (nums[i]!=nums[i-1] && nums[i]!=nums[i+1]) {
        if (nums[i-1] < nums[i+1]) arr[i] = nums[i+1];
        else arr[i] = nums[i-1];
      }
    }
  }
  return arr;
}

/* zeroFront */
public int[] zeroFront(int[] nums) {
  int count = 0;
  int temp = 0;
  for(int i=0; i<nums.length; i++) {
    if (nums[i]==0) count++;
  }
  int[] arr = new int[nums.length];
  for (int j=0; j<nums.length; j++) {
    if (j<count) arr[j] = 0;
    else {
      for(int k=0; k<nums.length; k++) {
        if (nums[k]!=0) temp = nums[k];
      } 
      arr[j] = temp;
    }
  }
  return arr;
}

/* withoutTen */
public int[] withoutTen(int[] nums) {
  int[] arr = new int[nums.length];
  int count = 0;
  int n = 0;  
  for(int i=0; i<nums.length; i++) {
    if (nums[i]!=10) count++;
  }  
  for (int j=0; j<nums.length; j++) {
    if (n < count && nums[j]!=10) {
      arr[n] = nums[j];
      n++;
    }
  }
  if (n>=count && n<nums.length) {
    arr[n] = 0;
    n++;
  }
  return arr;
}

/* zeroMax */
public int[] zeroMax(int[] nums) {
  int max = 0;
  for (int i=nums.length-1; i>=0; i--) {
    if (nums[i]%2==1) max = Math.max(max,nums[i]);
    if (nums[i]==0) nums[i] = max;
  }
  return nums;
}

/* evenOdd */
public int[] evenOdd(int[] nums) {
  int count = 0;
  int even = 0;
  int odd = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i]%2==0) {
      count++;
      even = nums[i];
    }
    else odd = nums[i];
  }
  for (int j=0; j<nums.length; j++) {
    if (j<count) nums[j] = even;
    else nums[j] = odd;
  }
  return nums;
}

/* fizzBuzz */
public String[] fizzBuzz(int start, int end) {
  String[] arr = new String[end - start];
  for (int i=start; i<end; i++) {
    if (i%5!=0 && i%3!=0) arr[i-start] = String.valueOf(i);
    if (i%3==0 && i%5!=0) arr[i-start] = "Fizz";
    if (i%5==0 && i%3!=0) arr[i-start] = "Buzz";
    if (i%15==0) arr[i-start] = "FizzBuzz";
  }
  return arr;
}
