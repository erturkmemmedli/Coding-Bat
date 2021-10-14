/* firstLast6 */
public boolean firstLast6(int[] nums) {
  return nums[0]==6 || nums[nums.length-1]==6;
}

/* sameFirstLast */
public boolean sameFirstLast(int[] nums) {
  return nums.length!=0 && nums[0]==nums[nums.length-1];
}

/* makePi */
public int[] makePi() {
  int[] pi = {3,1,4};
  return pi;
}

/* commonEnd */
public boolean commonEnd(int[] a, int[] b) {
  return a[0]==b[0] || a[a.length-1]==b[b.length-1];
}

/* sum3 */
public int sum3(int[] nums) {
  return nums[0]+nums[1]+nums[2];
}

/* rotateLeft3 */
public int[] rotateLeft3(int[] nums) {
  int[] teze = {nums[1],nums[2],nums[0]};
  return teze;
}

/* reverse3 */
public int[] reverse3(int[] nums) {
  int[] reverse = {nums[2],nums[1],nums[0]};
  return reverse;
}

/* maxEnd3 */
public int[] maxEnd3(int[] nums) {
  if (nums[0]>=nums[2]) {
    int[] teze1 = {nums[0],nums[0],nums[0]};
    return teze1;
  }
  int[] teze2 = {nums[2],nums[2],nums[2]};
  return teze2;
}

/* sum2 */
public int sum2(int[] nums) {
  if (nums.length>1) {return nums[0]+nums[1];}
  else if (nums.length==1) {return nums[0];}
  return 0;
}

/* middleWay */
public int[] middleWay(int[] a, int[] b) {
  int[] teze = {a[1],b[1]};
  return teze;
}

/* makeEnds */
public int[] makeEnds(int[] nums) {
  int[] teze = {nums[0],nums[nums.length-1]};
  return teze;
}

/* has23 */
public boolean has23(int[] nums) {
  return nums[0]==2||nums[0]==3||nums[1]==2||nums[1]==3;
}

/* no23 */
public boolean no23(int[] nums) {
  return nums[0]!=2&&nums[0]!=3&&nums[1]!=2&&nums[1]!=3;
}

/* makeLast */
public int[] makeLast(int[] nums) {
  int[] teze = new int[nums.length*2];
  for (int i=0;i<nums.length*2;i++) {
    teze[i] = 0;
  }
  teze[teze.length-1] = nums[nums.length-1];
  return teze;
}

/* double23 */
public boolean double23(int[] nums) {
  return nums.length==2 && ((nums[0]==2 && nums[1]==2) || (nums[0]==3 && nums[1]==3));
}

/* fix23 */
public int[] fix23(int[] nums) {
  int[] fixed = new int[3];
  fixed = nums;
  for (int i=0;i<nums.length-1;i++) {
    if (nums[i]==2 && nums[i+1]==3) {fixed[i+1]=0;}
  }
  return fixed;
}

/* start1 */
public int start1(int[] a, int[] b) {
  int count = 0;
  if (a.length!=0 && a[0]==1) {count+=1;}
  if (b.length!=0 && b[0]==1) {count+=1;}
  return count;
}

/* biggerTwo */
public int[] biggerTwo(int[] a, int[] b) {
  if ((a[0]+a[1])>=(b[0]+b[1])) {return a;}
  return b;
}

/* makeMiddle */
public int[] makeMiddle(int[] nums) {
  int[] teze = {nums[nums.length/2-1],nums[nums.length/2]};
  return teze;
}

/* plusTwo */
public int[] plusTwo(int[] a, int[] b) {
  int[] teze = {a[0],a[1],b[0],b[1]};
  return teze;
}

/* swapEnds */
public int[] swapEnds(int[] nums) {
  int temporary = nums[0];
  nums[0] = nums[nums.length-1];
  nums[nums.length-1] = temporary;
  return nums;
}

/* midThree */
public int[] midThree(int[] nums) {
  int[] teze = {nums[nums.length/2-1],nums[nums.length/2],nums[nums.length/2+1]};
  return teze;
}

/* maxTriple */
public int maxTriple(int[] nums) {
  int max = 0;
  for (int i=0; i<nums.length; i+=nums.length/2) {
    max = Math.max(nums[i],max);
  }
  return max;
}

/* frontPiece */
public int[] frontPiece(int[] nums) {
  if (nums.length<2) {return nums;}
  else {
    int[] yeni = {nums[0],nums[1]};
    return yeni;
  }
}

/* unlucky1 */
public boolean unlucky1(int[] nums) {
  if(nums.length>2) {
    int axir = nums.length-2;
    if ((nums[0]==1 && nums[1]==3) || (nums[axir]==1 && nums[axir+1]==3)) {return true;}
    if ((nums[1]==1 && nums[2]==3)) {return true;}
    return false;
  }
  else if (nums.length==2) {return nums[0]==1 && nums[1]==3;}
  return false;
}

/* make2 */
public int[] make2(int[] a, int[] b) {
  int[] arr = new int[2];
  if (a.length==0) {arr[0]=b[0];arr[1]=b[1];return arr;}
  else if (a.length==1) {arr[0]=a[0];arr[1]=b[0];return arr;}
  else {arr[0]=a[0];arr[1]=a[1];return arr;}
}

/* front11 */
public int[] front11(int[] a, int[] b) {
  if (a.length==0 && b.length==0) {
    int[] arr = new int[0];
    return arr;
  }
  else if (a.length>0 && b.length>0) {
    int[] arr = new int[2];
    arr[0]=a[0];arr[1]=b[0];return arr;
  }
  else {
    int[] arr = new int[1];
    if (a.length==0) {arr[0]=b[0];return arr;}
    else {arr[0]=a[0];return arr;}
  }
}
