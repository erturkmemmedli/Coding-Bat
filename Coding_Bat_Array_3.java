/* maxSpan */
public int maxSpan(int[] nums) {
  int span = 0;
  int tmp = 0;
  for (int i = 0; i < nums.length; i++) {
    for (int j = 0; j < nums.length; j++) {
      if (nums[i] == nums[j]) {
        tmp = j-i+1;
        span = Math.max(tmp,span);
      }
    }
  }
  return span;
}

/* fix34 */
public int[] fix34(int[] nums) {
    for (int i = 0; i < nums.length; i++)
        if (nums[i] == 3) {
            int temp = nums[i + 1];
            nums[i + 1] = 4;
            for (int j = i + 2; j < nums.length; j++)
                if (nums[j] == 4) nums[j] = temp;
        }
    return nums;
}

/* fix45 */
public int[] fix45(int[] nums) {
  for (int i = 0; i < nums.length; i++)
    if (nums[i] == 5 && i == 0 || nums[i] == 5 && nums[i - 1] != 4) {
      int pos5 = i;
      for (int j = 0; j < nums.length; j++)
        if (nums[j] == 4 && nums[j + 1] != 5) {
          int temp = nums[j + 1];
          nums[j + 1] = 5;
          nums[pos5] = temp;
          break;
        }
  }
  return nums;
}

/* canBalance */
public boolean canBalance(int[] nums) {
  for (int i=0; i<nums.length; i++) {
    int sum = 0;
    for (int j=0; j<i; j++) sum += nums[j];
    for (int j=i; j<nums.length; j++) sum -= nums[j];
    if (sum == 0) return true;
  }
  return false;
}

/* linearIn */
public boolean linearIn(int[] outer, int[] inner) {
  int indexInner = 0;
  int indexOuter = 0;
  while (indexInner < inner.length && indexOuter < outer.length) {
    if (outer[indexOuter] == inner[indexInner]) {
      indexOuter++;
      indexInner++;
    }
    else indexOuter++;
  }
  return (indexInner == inner.length);
}

/* squareUp */
public int[] squareUp(int n) {
    int[] array = new int[n*n];
    int position = 0;
    for (int i = 1; i<=n; i++) {
        for (int k = 1; k<=n-i; k++) array[position++] = 0;
        for (int j = i; j>0; j--) array[position++] = j;
    }
    return array;
}

/* seriesUp */
public int[] seriesUp(int n) {
  int[] array = new int[n*(n + 1)/2];
  int position = 0;
  for (int i = 1; i<=n; i++) {
    for (int k = 1; k<=i; k++)
      array[position++] = k;
  }
  return array;
}

/* maxMirror */
public int maxMirror(int[] nums) {
  int[] numsCopy = new int[nums.length];
  for (int i = nums.length - 1, j = 0; i >= 0; i--, j++)
    numsCopy[j] = nums[i];
  int max = 0;
  for (int i = 0; i < nums.length; i++) {
    int count = 0;
    int pos1 = i;
    int pos2 = 0;
    boolean flag = false;
    while (pos1 < nums.length && pos2 < nums.length) {
      if (!flag) {
        if (nums[pos1] != numsCopy[pos2]) pos2++;
        else {
          flag = true;
          count = 1;
          pos1++;
          pos2++;
        }
      }
      else {
        if (nums[pos1] == numsCopy[pos2]) {
          count++;
          pos1++;
          pos2++;
        }
        else {
          if (count > max) max = count;
          pos1 = i;
          flag = false;
        }
      }
      if (count > max) max = count;
    }
  }
  return max;
}

/* countClumps */
public int countClumps(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length - 1; i++)
        if (nums[i] == nums[i + 1]) {
            count++;
            for (int j = i + 1; j < nums.length; j++)
                if (nums[j] == nums[i]) i++;
                else break;
        }
    return count;
}
