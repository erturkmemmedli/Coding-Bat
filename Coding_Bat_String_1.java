/* helloName */
public String helloName(String name) {
  return "Hello " + name + "!";
}

/* makeAbba */
public String makeAbba(String a, String b) {
  return a+b+b+a;
}

/* makeTags */
public String makeTags(String tag, String word) {
  return "<"+tag+">"+word+"</"+tag+">";
}

/* makeOutWord */
public String makeOutWord(String out, String word) {
  return out.substring(0,2)+word+out.substring(2);
}

/* extraEnd */
public String extraEnd(String str) {
  String result = str.substring(str.length()-2);
  return result+result+result;
}

/* firstTwo */
public String firstTwo(String str) {
  if (str.length()<2) return str;
  else return str.substring(0,2);
}

/* firstHalf */
public String firstHalf(String str) {
  return str.substring(0,str.length()/2);
}

/* withoutEnd */
public String withoutEnd(String str) {
  return str.substring(1,str.length()-1);
}

/* comboString */
public String comboString(String a, String b) {
  if (a.length()>b.length()) return b+a+b;
  else return a+b+a;
}

/* nonStart */
public String nonStart(String a, String b) {
  return a.substring(1)+b.substring(1);
}

/* left2 */
public String left2(String str) {
  return str.substring(2)+str.substring(0,2);
}

/* right2 */
public String right2(String str) {
  return str.substring(str.length()-2)+str.substring(0,str.length()-2);
}

/* theEnd */
public String theEnd(String str, boolean front) {
  if (front) return str.substring(0,1);
  else return str.substring(str.length()-1);
}

/* withouEnd2 */
public String withouEnd2(String str) {
  if (str.length() <= 1) {
    return "";
  }
  else {
    return str.substring(1,str.length()-1);
  }
}

/* middleTwo */
public String middleTwo(String str) {
  return str.substring(str.length()/2-1,str.length()/2+1);
}

/* endsLy */
public boolean endsLy(String str) {
  if (str.length()<=1) return false;
  else return str.substring(str.length()-2).equals("ly");
}

/* nTwice */
public String nTwice(String str, int n) {
  return str.substring(0,n)+str.substring(str.length()-n);
}

/* twoChar */
public String twoChar(String str, int index) {
  if (str.length()<=(index)+1 || index<0) {return str.substring(0,2);}
  else {return str.substring(index,index+2);}
}

/* middleThree */
public String middleThree(String str) {
  return str.substring(str.length()/2-1,str.length()/2+2);
}

/* hasBad */
public boolean hasBad(String str) {
  if (str.length()>3) {
    if (str.substring(0,3).equals("bad")||str.substring(1,4).equals("bad")) {
      return true;
    }
    return false;
  }
  else if (str.length()==3 && (str.substring(0,3).equals("bad"))) {
    return true;
  }
  return false;
}

/* atFirst */
public String atFirst(String str) {
  if (str.length()>=2) return str.substring(0,2);
  else if (str.length()==1) return str+"@";
  else return "@@";
}

/* lastChars */
public String lastChars(String a, String b) {
  String strnew = "";
  if (a.length()!=0) strnew = a.substring(0,1);
  else strnew = "@";
  if (b.length()!=0) strnew = strnew + b.substring(b.length()-1,b.length());
  else strnew = strnew + "@";
  return strnew;
}

/* conCat */
public String conCat(String a, String b) {
  if (a.length()>0 && b.length()>0) {
    if (a.substring(a.length()-1,a.length()).equals(b.substring(0,1))) {
      return a + b.substring(1);
    }
    return a+b;
  }
  else if (a.length()==0) return b;
  else return a;
}

/* lastTwo */
public String lastTwo(String str) {
  if (str.length()>2) {
    String qabag = str.substring(0,str.length()-2);
    String son = str.substring(str.length()-1);
    String birevvel = str.substring(str.length()-2,str.length()-1);
    return qabag + son + birevvel;
  }
  else if (str.length()==2) {return str.substring(1)+str.substring(0,1);}
  else return str;
}

/* seeColor */
public String seeColor(String str) {
  if (str.startsWith("blue")) {return "blue";}
  else if (str.startsWith("red")) {return "red";}
  return "";
}

/* frontAgain */
public boolean frontAgain(String str) {
  if (str.length()>=2) {
    return str.substring(0,2).equals(str.substring(str.length()-2,str.length()));
  }
  return false;
}

/* minCat */
public String minCat(String a, String b) {
  int mesafe = Math.abs(a.length()-b.length());
  if (a.length()>b.length()) {
    return a.substring(mesafe) + b;
  }
  else if (a.length()<b.length()) {
    return a + b.substring(mesafe);
  }
  return a + b;
}

/* extraFront */
public String extraFront(String str) {
  if (str.length()<2) {return str + str + str;}
  else return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
}

/* without2 */
public String without2(String str) {
  if (str.length()>=2) {
    if (str.substring(0,2).equals(str.substring(str.length()-2))) {
      return str.replaceFirst(str.substring(0,2),"");
    }
    return str;
  }
  return str;
}

/* deFront */
public String deFront(String str) {
  String teze = "";
  if (str.length()>=2) {
    if (str.substring(0,1).equals("a")) {teze = teze = "a";}
    if (str.substring(1,2).equals("b")) {teze = teze + "b";}
    return teze + str.substring(2);
  }
  else if (str.length()==1) {
    if (str.substring(0,1).equals("a")) {teze = teze = "a";}
    if (str.substring(1,2).equals("b")) {teze = teze + "b";}
    return teze;
  }
  else return "";
}

/* startWord */
public String startWord(String str, String word) {
  if (str.length()>=word.length()) {
    if (word.length()>1) {
      if (str.substring(1,word.length()).equals(word.substring(1))) {
        return str.substring(0,1)+word.substring(1);
      }
      return "";
    }
    else if (word.length()==1) {return str.substring(0,1);}
    return "";
  }
  return "";
}

/* withoutX */
public String withoutX(String str) {
  if (str.length()==0) {return "";}
  if (str.length()==1 && str.equals("x")) {return "";}
  if (str.length()>1 && str.substring(0,1).equals("x")) {
    str = str.substring(1);
  }
  if (str.length()>=1 && str.substring(str.length()-1).equals("x")) {
    str = str.substring(0,str.length()-1);
  }
  return str;
}

/* withoutX2 */
public String withoutX2(String str) {
  if(str.length()>1){
    if(str.substring(0,1).equals("x")||str.substring(1,2).equals("x")){
      String str2 = str.substring(0,2);
      return str2.replace("x","")+str.substring(2);
    }
    return str;
  }
  else if (str.length()==1){
    if(str.equals("x")){return "";}
    return str;
  }
  return str;
}
