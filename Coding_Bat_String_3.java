/* countYZ */
public int countYZ(String str) {
  int len = str.length();
  str = str.toLowerCase();
  int count = 0;
  for (int i=0; i<len-1; i++) {
    if (str.substring(i,i+1).equals("y") || str.substring(i,i+1).equals("z")) {
      if (! Character.isLetter(str.charAt(i+1)))
        count++;
    }
  }
  if (str.substring(len-1,len).equals("y") || str.substring(len-1,len).equals("z"))
  count++;
  return count;
}

/* withoutString */
public String withoutString(String base, String remove) {
  int b = base.length();
  int r = remove.length();
  String low_b = base.toLowerCase();
  String low_r = remove.toLowerCase();
  String Final = "";
  for (int i=0; i<b; i++) {
    if (i <= b-r) {
      if (! low_b.substring(i,i+r).equals(low_r))
        Final += base.substring(i,i+1);
      else i += r-1;
    }
    else {
      if (! low_b.substring(i,i+1).equals(low_r))
        Final += base.substring(i,i+1);
    }
  }
  return Final;
}

/* equalIsNot */
public boolean equalIsNot(String str) {
  int count_is = 0;
  int count_not = 0;
  for (int i=0; i<str.length()-1; i++) {
    if (i < str.length()-2) {
      if (str.substring(i,i+3).equals("not"))
        count_not ++;
    }
    if (str.substring(i,i+2).equals("is"))
      count_is ++;
  }
  return count_not == count_is;
}

/* gHappy */
public boolean gHappy(String str) {
  if (str.length()==1) return false;
  for (int i=0; i<str.length(); i++) {
    if (i>0 && i<str.length()-1) {
      if (str.charAt(i) == 'g' && ! (str.charAt(i-1) == 'g' || str.charAt(i+1) == 'g'))
        return false;
    }
    if (i==0) {
      if (str.charAt(i) == 'g' && str.charAt(i+1) != 'g')
        return false;
    }
    if (i==str.length()-1) {
      if (str.charAt(i) == 'g' && str.charAt(i-1) != 'g')
        return false;
    }
  }
  return true;
}

/* countTriple */
public int countTriple(String str) {
  int count = 0;
  for (int i=0; i<str.length()-2; i++) {
    char bir = str.charAt(i);
    char iki = str.charAt(i+1);
    char uc = str.charAt(i+2);
    if (bir == iki && iki == uc) count++;
  }
  return count;
}

/* sumDigits */
public int sumDigits(String str) {
  int sum = 0;
  for (int i=0; i<str.length(); i++) {
    if (str.charAt(i)>=48 && str.charAt(i)<=57) {
      char reqem = str.charAt(i);
      int convert = reqem - '0';
      sum += convert;
    }
  }
  return sum;
}

/* sameEnds */
public String sameEnds(String string) {
  int len = string.length();
  String temp = "";
  String fin = "";
  for (int i=0; i<len; i++) {
    temp += string.charAt(i);
    int tlen = temp.length();
    if (i<len/2 && temp.equals(string.substring(len-tlen,len)))
      fin = temp;
  }
  return fin;
}

/* mirrorEnds */
public String mirrorEnds(String string) {
  int len = string.length();
  int k = string.length();
  String temp = "";
  for (int i=0; i<len; i++) {
    if (string.substring(i,i+1).equals(string.substring(k-1,k))) {
      temp += string.substring(i,i+1);
      k--;
    }
    else break;
  }
  return temp;
}

/* maxBlock */
public int maxBlock(String str) {
  int len = str.length();
  int count = 0;
  int temp = 1;
  if (len ==0) return 0;
  for (int i=0; i<len; i++) {
    if(i<len-1 && str.charAt(i)==str.charAt(i+1)) temp++;
    else temp = 1;
    if (temp>count) count = temp;
  }
  return count;
}

/* sumNumbers */
public int sumNumbers(String str) {
  int sum = 0;
  String string = "";
  for (int i=0; i<str.length(); i++) {
    if (Character.isDigit(str.charAt(i))) {
      if (i<str.length()-1 && Character.isDigit(str.charAt(i+1))) {
        string += str.charAt(i);
      }
      else {
        string += str.charAt(i);
        sum += Integer.parseInt(string);
        string = "";
      }
    }
  }
  return sum;
}

/* notReplace */
public String notReplace(String str) {
  int l = str.length();
  String change = "";
  for (int i=0; i<l; i++) {
    if ((i>=1 && Character.isLetter(str.charAt(i-1))) || (i<l-2 && Character.isLetter(str.charAt(i+2)))) {
      change += str.charAt(i);
    }
    else if (i<l-1 && str.substring(i,i+2).equals("is")) {
      change += "is not";
      i++;
    }
    else change += str.charAt(i);
  }
  return change;
}
