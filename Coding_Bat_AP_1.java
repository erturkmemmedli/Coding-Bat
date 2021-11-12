/* scoresIncreasing */
public boolean scoresIncreasing(int[] scores) {
  for (int i=0; i < scores.length-1; i++) {
    if (scores[i+1]<scores[i]) return false;
  }
  return true;
}

/* scores100 */
public boolean scores100(int[] scores) {
  for (int i=0; i<scores.length-1; i++) {
    if (scores[i]==100 && scores[i+1]==100) return true;
  }
  return false;
}

/* scoresClump */
public boolean scoresClump(int[] scores) {
  for (int i=0; i<scores.length-2; i++) {
    if (scores[i+2]-scores[i]<=2) return true;
  }
  return false;
}

/* scoresAverage */
public int scoresAverage(int[] scores) {
  int average1 = average (scores, 0, scores.length/2);
  int average2 = average (scores, scores.length/2, scores.length);
  return Math.max(average1, average2);
}
int average(int[] scores, int start, int end) {
  int sum = 0;
  for (int i=start; i<end; i++) {
    sum += scores[i];
  }
  return sum/(end-start);
}

/* wordsCount */
public int wordsCount(String[] words, int len) {
  int count = 0;
  for (int i=0; i<words.length; i++) {
    if (words[i].length() == len) count++;
  }
  return count;
}

/* wordsFront */
public String[] wordsFront(String[] words, int n) {
  String[] array = new String[n];
  for (int i = 0; i < n; i++) {
    array[i] = words[i];
  }
  return array;
}

/* wordsWithoutList */
public List wordsWithoutList(String[] words, int len) {
  ArrayList list = new ArrayList();
  for (int i = 0; i < words.length; i++) {
    if (words[i].length() != len) {
      list.add(words[i]);
    }
  }
  return list;
}

/* hasOne */
public boolean hasOne(int n) {
  if (n%10 == 1) return true;
  else {
    while (n>=10) {
      n = n/10;
      if (n%10 == 1) return true; 
    }
  }
  return false;
}

/* dividesSelf */
public boolean dividesSelf(int n) {
  int store = n;
  if (n%10 == 0) return false;
  else {
    while (n >= 10 && store%(n%10) == 0) {
      n = n/10;
      if (store%10 == 0) return false;
    }
    if (store%(n%10) != 0) return false;
    return true;
  }
}

/* copyEvens */
public int[] copyEvens(int[] nums, int count) {
  int control = 0;
  int[] teze = new int[count];
  for (int i = 0; i < nums.length; i++) {
    if (nums[i]%2==0) {
      teze[control] = nums[i];
      control++;
    }
    if (control == count) return teze;
  }
  return nums;
}

/* copyEndy */
public int[] copyEndy(int[] nums, int count) {
  int control = 0;
  int[] teze = new int[count];
  for (int i = 0; i < nums.length; i++) {
    if ((nums[i]>=0 && nums[i]<=10)||(nums[i]>=90 && nums[i]<=100)) {
      teze[control] = nums[i];
      control++;
    }
    if (control == count) return teze;
  }
  return nums;
}

/* matchUp */
public int matchUp(String[] a, String[] b) {
  int count = 0;
  for (int i=0; i<a.length; i++) {
    if (!a[i].equals("") && !b[i].equals("")) {
      if (a[i].charAt(0)==b[i].charAt(0))
        count++;
    }
  }
  return count;
}

/* scoreUp */
public int scoreUp(String[] key, String[] answers) {
  int qiymet = 0;
  for (int i=0; i<key.length; i++) {
    if (answers[i].equals("?")) qiymet += 0;
    else if (answers[i].equals(key[i])) qiymet += 4;
    else qiymet -= 1;
  }
  return qiymet;
}

/* wordsWithout */
public String[] wordsWithout(String[] words, String target) {
  int count = 0;
  for (int i=0; i<words.length; i++) {
    if (words[i].equals(target))
      count++;
  }
  count = words.length - count;
  String[] yeni = new String[count];
  int ctrl = 0;
  for (int i = 0; i < words.length; i++) {
    if (!words[i].equals(target)) {
      yeni[ctrl] = words[i];
      ctrl++;
    }
  }
  return yeni;
}

/* scoresSpecial */
public int scoresSpecial(int[] a, int[] b) {
  return special(a) + special(b);
}
int special(int[] num) {
  int store = 0;
  for (int i=0; i<num.length; i++) {
    if (num[i]%10==0) store = Math.max(store,num[i]);
  }
  return store;
}

/* sumHeights */
public int sumHeights(int[] heights, int start, int end) {
  int sum = 0;
  for (int i = start; i < end; i++) {
    sum += Math.abs(heights[i]-heights[i+1]);
  }
  return sum;
}

/* sumHeights2 */
public int sumHeights2(int[] heights, int start, int end) {
  int sum = 0;
  for (int i = start; i < end; i++) {
    if (heights[i] >= heights[i+1]) sum += heights[i]-heights[i+1];
    if (heights[i] < heights[i+1]) sum += 2*(heights[i+1]-heights[i]);
  }
  return sum;
}

/* bigHeights */
public int bigHeights(int[] heights, int start, int end) {
  int count = 0;
  for (int i = start; i < end; i++) {
    if (Math.abs(heights[i]-heights[i+1])>=5) count++;
  }
  return count;
}

/* userCompare */
public int userCompare(String aName, int aId, String bName, int bId) {
  if (aName.equals(bName)) {
    if (aId > bId) return 1;
    if (aId < bId) return -1;
    if (aId == bId) return 0;
  }
  for (int i=0; i<Math.min(aName.length(),bName.length()); i++) {
    if (aName.charAt(i) < bName.charAt(i)) return -1;
    else if (aName.charAt(i) > bName.charAt(i)) return 1;
  }
  return 0;
}

/* mergeTwo */
public String[] mergeTwo(String[] a, String[] b, int n) {
  int aindex = 0;
  int bindex = 0;
  String[] arr = new String[n];
  for (int i = 0; i < n; i++) {
    int cmp = a[aindex].compareTo( b[bindex] );
    if(cmp<=0)
    {
      arr[i] = a[aindex++];
      if(cmp == 0) bindex++;
    }
    else
    {
      arr[i] = b[bindex++];
    }
  }
  return arr;
}

/* commonTwo */
public int commonTwo(String[] a, String[] b) {
  int count = 0;
  String str = "";
  for (int i = 0; i < b.length; i++) {
    for (int j = 0; j < a.length; j++) {
      if (a[j].equals(b[i]) && !str.contains(a[j])) {
        str += a[j];
        count++;
      }
    }
  }
  return count;
}
