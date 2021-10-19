/* doubleChar */
public String doubleChar(String str) {
  String string = "";
  for (int i = 0; i<str.length(); i++) {
    string = string + str.substring(i,i+1) + str.substring(i,i+1);
  }
  return string;
}

/* countHi */
public int countHi(String str) {
  int count = 0;
  for (int i=0; i<str.length()-1; i++) {
    if (str.substring(i,i+2).equals("hi")) {
      count++;
    }
  }
  return count;
}

/* catDog */
public boolean catDog(String str) {
  int count1=0;
  int count2=0;
  for (int i=0; i<str.length()-2; i++) {
    if (str.substring(i,i+3).equals("cat")) {
      count1++;
    }
  }
  for (int i=0; i<str.length()-2; i++) {
    if (str.substring(i,i+3).equals("dog")) {
      count2++;
    }
  }
  return count1==count2;
}

/* countCode */
public int countCode(String str) {
  int count=0;
  for (int i=0; i<str.length()-3; i++) {
    if (str.substring(i,i+2).equals("co") && str.substring(i+3,i+4).equals("e"))
    {count++;}
  }
  return count;
}

/* endOther */
public boolean endOther(String a, String b) {
  String low_a = a.toLowerCase();
  String low_b = b.toLowerCase();
  if (a.length()>=b.length()) {
    String axir1 = low_a.substring(a.length()-b.length());
    return low_b.equals(axir1);
  }
  if (a.length()<b.length()) {
    String axir2 = low_b.substring(b.length()-a.length());    
    return low_a.equals(axir2);
  }
  return false;
}

/* xyzThere */
public boolean xyzThere(String str) {
  String xyz = "xyz";
  if (str.length()<3) return false;
  for (int i=0; i<str.length()-2; i++) {
    String temp = str.substring(i,i+3);
    if (i==0 && temp.compareTo(xyz)==0) return true;
    else if (temp.compareTo(xyz)==0 && str.charAt(i-1)!=46) return true;
  }
  return false;
}

/* bobThere */
public boolean bobThere(String str) {
  for (int i=0; i<str.length()-2; i++) {
    if (str.charAt(i)==98 && str.charAt(i+2)==98) return true;
  }
  return false;
}

/* xyBalance */
public boolean xyBalance(String str) {
  if (str.length()==0) return true;
  int x = str.lastIndexOf('x');
  int y = str.lastIndexOf('y');
  int count = 0;
  for (int i=0; i<str.length(); i++) {
    if (str.substring(i,i+1).equals("x")) count++;
  }
  if (count == 0) return true;
  return x<y;
}

/* mixString */
public String mixString(String a, String b) {
  String str = "";
  for (int i=0; i<Math.min(a.length(),b.length()); i++) {
    str = str + a.substring(i,i+1) + b.substring(i,i+1);
  }
  if (a.length()>b.length()) {
    return str + a.substring(b.length());
  }
  else if (a.length()==b.length()) {
    return str;
  }
  else {
    return str + b.substring(a.length());
  }
}

/* repeatEnd */
public String repeatEnd(String str, int n) {
  String teze = "";
  for (int i=0; i<n; i++) {
    teze = teze + str.substring(str.length()-n);
  }
  return teze;
}

/* repeatFront */
public String repeatFront(String str, int n) {
  String teze = "";
  for (int i=n; i>=0; i--) {
    teze = teze + str.substring(0,i);
  }
  return teze;
}

/* repeatSeparator */
public String repeatSeparator(String word, String sep, int count) {
  String string = "";
  if (count==0) return string;
  for (int i=0; i<count-1; i++) {
    string = string + word + sep;
  }
  return string + word;
}

/* prefixAgain */
public boolean prefixAgain(String str, int n) {
  for (int i=0; i<str.length()-n; i++) {
    if (str.substring(0,n).equals(str.substring(i+1,i+n+1))) return true;
  }
  return false;
}

/* xyzMiddle */
public boolean xyzMiddle(String str) {
  if (str.length()<3) return false;
  int mid = str.length()/2;
  String str1 = str.substring(mid-1,mid+2);
  if (str.length()%2!=0) {
    if (str1.equals("xyz")) return true;
    return false;
  }
  else {
    String str2 = str.substring(mid-2,mid+1);
    if (str2.equals("xyz") || str1.equals("xyz")) return true;
    return false;
  }
}

/* getSandwich */
public String getSandwich(String str) {
  int ilk = str.indexOf("bread");
  int son = str.lastIndexOf("bread");
  int count = 0;
  for (int i=0; i<str.length()-4; i++) {
    if (str.substring(i,i+5).equals("bread")) count++;
  }
  if (count <= 1) return "";
  return str.substring(ilk+5,son);
}

/* sameStarChar */
public boolean sameStarChar(String str) {
  for (int i=1; i<str.length()-1; i++) {
    if (str.substring(i,i+1).equals("*") && str.charAt(i-1)!=str.charAt(i+1)) {
      if (str.charAt(i-1)==str.charAt(i+1)) {return true;}
      return false ;
    }
  }
  return true;
}

/* oneTwo */
public String oneTwo(String str) {
  String dizi = "";
  for (int i=0; i<str.length()/3; i++) {
    dizi = dizi + str.substring(3*i+1,3*i+3) + str.substring(3*i,3*i+1);
  }
  return dizi + str.substring(str.length());
}

/* zipZap */
public String zipZap(String str) {
  String st = "";
  for (int i=0; i<str.length(); i++) {
    st += str.substring(i,i+1);
    if (i>0 && i<str.length()-1) {
      if (str.charAt(i-1)=='z' && str.charAt(i+1)=='p')
        st = st.substring(0,st.length()-1);
    }
  }
  return st;
}

/* starOut */
public String starOut(String str) {
  String st = "";
  for (int i=0; i<str.length(); i++) {
    if (i==0 && str.charAt(i)!='*')
    st += str.charAt(i);
    if (i>0 && str.charAt(i)!='*' && str.charAt(i-1)!='*')
    st += str.charAt(i);
    if (i>0 && str.charAt(i-1)!='*' && str.charAt(i)=='*')
    st = st.substring(0,st.length()-1);
  }
  return st;  
}

/* plusOut */
public String plusOut(String str, String word) {
  String yeni = "";
  for (int i=0; i<str.length(); i++) {
    if (i<=str.length()-word.length()) {
      if (str.substring(i,i+word.length()).equals(word)) {
        yeni += word;
        i += word.length()-1;
      }
      else yeni += "+";
    }
    else
      yeni += "+";
  }
  return yeni;
}

/* wordEnds */
public String wordEnds(String str, String word) {
  String a = "";
  int w = word.length();
  int s = str.length();
  for (int i=0; i<s-w+1; i++) {
    if (str.substring(i,w+i).equals(word)) {
      if (i>0)
        a += str.substring(i-1,i);
      if (i<s-w)
        a += str.substring(i+w,i+w+1);
    }
  }
  return a;
}
