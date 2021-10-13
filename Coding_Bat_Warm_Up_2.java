/* stringTimes */
public String stringTimes(String str, int n) {
  String dizi = "";
  for (int i=0; i<n; i++) {
    dizi = dizi + str;
  }
  return dizi;
}

/* frontTimes */
public String frontTimes(String str, int n) {
  String dizi = "";
  for (int i=0; i<n; i++) {
    if (str.length()>=3) {
      dizi = dizi + str.substring(0,3);
    }
    else {
      dizi = dizi + str;
    }
  }
  return dizi;
}

/* countXX */
int countXX(String str) {
  int count = 0;
  for (int i=0; i<str.length()-1; i++) {
    if (str.substring(i,i+2).equals("xx")) {
      count++;
    }
  }
  return count;
}

/* doubleX */
boolean doubleX(String str) {
  for (int i=0; i<str.length()-1; i++) {
    if (str.substring(i,i+1).equals("x")) {
      return str.substring(i+1,i+2).equals("x");
    }
  } 
  return false;
}

/* stringBits */
public String stringBits(String str) {
  String str2 = "";
  for (int i=0; i<str.length(); i++) {
    if (i%2==0){
      str2 = str2 + str.charAt(i);
    }
  }
  return str2;
}

/* stringSplosion */
public String stringSplosion(String str) {
  String str2 = "";
  for (int i=0; i<str.length(); i++) {
    str2 = str2 + str.substring(0,i+1);
  }
  return str2;
}

/* last2 */
public int last2(String str) {
  int count = 0;
  for (int i=0; i<str.length()-2; i++) {
    if (str.substring(str.length()-2,str.length()).equals(str.substring(i,i+2))) {
      count++;
    }
  }
  return count;
}

/* arrayCount9 */
public int arrayCount9(int[] nums) {
  int count = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i]==9) {
      count++;
    }
  }
  return count;
}

/* arrayFront9 */
public boolean arrayFront9(int[] nums) {
  if (nums.length>=4) {
    for (int i=0; i<4; i++) {
      if (nums[i]==9){
        return true;
      }
    }
  }
  if (nums.length<4){
    for (int i=0; i<nums.length; i++) 
      if (nums[i]==9)
        return true;
      }
      return false;
}

/* array123 */
public boolean array123(int[] nums) {
  int count = 0;
  for (int i=0; i<nums.length-2; i++) {
    if (nums[i]==1){
      count++;
      break;
    }
  }
  for (int j=0; j<nums.length; j++) {
    if (nums[j]==2){
      count++;
      break;
    }
  }
  for (int k=0; k<nums.length; k++) {
    if (nums[k]==3){
      count++;
      break;
    }
  }
  if(count==3){return true;}
  return false;
}

/* stringMatch */
public int stringMatch(String a, String b) {
  int count = 0;
  int meselcun;
  if (a.length()<=b.length()) {
    meselcun = a.length()-1;
  }
  else {
    meselcun = b.length()-1;
  }
  for (int i=0; i<meselcun; i++) {
    if (a.substring(i,i+2).equals(b.substring(i,i+2))){
      count++;
    }
  }
  return count;
}

/* stringX */
public String stringX(String str) {
  String replace = "";
  for (int i=0; i<str.length(); i++) {
    if (!((i>0 && i<str.length()-1) && str.substring(i,i+1).equals("x"))) {
      replace = replace + str.substring(i,i+1);
    }
  }
  return replace;
}

/* altPairs */
public String altPairs(String str) {
  String str2 = "";
  for(int i=0; i<str.length()-1; i+=4) {
    str2 = str2 + str.substring(i,i+2);
  }
  if(str.length()%4==1) {
    return str2 + str.substring(str.length()-1);
  }
  return str2;
}

/* stringYak */
public String stringYak(String string) {
  String new_string = "";
  int i = 0;
  while (i < string.length()) {
      if (i <= string.length() - 3 && string.charAt(i)=='y' && string.charAt(i+2)=='k') {
          i = i + 3;
          continue;
      }
      new_string = new_string + string.charAt(i);
      i = i + 1;
  }
  return new_string;
}

/* array667 */
public int array667(int[] nums) {
  int count = 0;
  for (int i=0; i<nums.length-1; i++) {
    if (nums[i]==6 && (nums[i+1]==6 || nums[i+1]==7)) {
      count++;
    }
  }
  return count;
}

/* noTriples */
public boolean noTriples(int[] nums) {
  for (int i=0; i<nums.length-2; i++) {
    if (nums[i]==nums[i+1] && nums[i]==nums[i+2]) {
      return false;
    }
  }
  return true;
}

/* has271 */
public boolean has271(int[] nums) {
  for (int i=0;i<nums.length-2;i++) {
    if (nums[i+1]==nums[i]+5 && (Math.abs(nums[i+2]-nums[i]+1))<=2) {
      return true;
    }
  }
  return false;
}
