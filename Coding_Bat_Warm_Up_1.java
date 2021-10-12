/* sleepIn */
public boolean sleepIn(boolean weekday, boolean vacation) {
  return !weekday | vacation;
}

/* monkeyTrouble */
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return ((aSmile & bSmile) | (!aSmile & !bSmile));
}

/* sumDouble */
public int sumDouble(int a, int b) {
  if (a!=b){
    return a+b;
  }
  return 2*(a+b);
}

/* diff21 */
public int diff21(int n) {
  if (n<=21){
    return Math.abs(n-21);
  }
  return 2*Math.abs(n-21);
}

/* parrotTrouble */
public boolean parrotTrouble(boolean talking, int hour) {
  return(talking & (hour<7|hour>20));
}

/* makes10 */
public boolean makes10(int a, int b) {
  return(a==10|b==10|(a+b==10));
}

/* nearHundred */
public boolean nearHundred(int n) {
  if(Math.abs(100-n)<=10){
    return true;
  }
  else if (Math.abs(200-n)<=10){
    return true;
  }
  return false;
}

/* posNeg */
public boolean posNeg(int a, int b, boolean negative) {
  if(!negative){
    return((a<0|b<0) & !(a<0&b<0));
  }
  return(a<0&b<0);
}

/* notString */
public String notString(String str) {
  if (str.length()>=3 && str.substring(0,3).equals("not")) {
    return str;
  }
  return "not " + str;
}

/* missingChar */
public String missingChar(String str, int n) {
  return(str.replace(str.substring(n,n+1),""));
}

/* frontBack */
public String frontBack(String str) {
  if(str.length()>1){
    String end = str.substring(str.length()-1,str.length());
    String front = str.substring(0,1);
    return end  + str.substring(1,str.length()-1) + front;
  }
  else{
    return str;
  }
}

/* front3 */
public String front3(String str) {
  if (str.length()<3) {
    String str_new = "";
    for(int i = 0; i<3; i++) {
      str_new = str_new + str;
    }
    return str_new;
  }
  else {
    String str_new = "";
    for(int i = 0; i<3; i++) {
      str_new = str_new + str.substring(0,3);
    }
    return str_new;
  }
}

/* backAround */
public String backAround(String str) {
  String end = str.substring(str.length()-1,str.length());
  return end + str + end;
}

/* or35 */
public boolean or35(int n) {
  return n%5==0||n%3==0;
}

/* front22 */
public String front22(String str) {
  if (str.length()>1) {
    return str.substring(0,2) + str + str.substring(0,2);    
  }
  return str + str + str;
}

/* startHi */
public boolean startHi(String str) {
  if (str.length()>1){
    return str.substring(0,2).equals("hi");
  }
  return false;
}

/* icyHot */
public boolean icyHot(int temp1, int temp2) {
  return (temp1<0 && temp2>100)||(temp2<0 && temp1>100);
}

/* in1020 */
public boolean in1020(int a, int b) {
  return (10<=a && a<=20 || 10<=b && b<=20);
}

/* hasTeen */
public boolean hasTeen(int a, int b, int c) {
  return (13<=a && a<=19)||(13<=b && b<=19)||(13<=c && c<=19);
}

/* loneTeen */
public boolean loneTeen(int a, int b) {
  return ((13<=a && a<=19) || (13<=b && b<=19)) && !((13<=a && a<=19) && (13<=b && b<=19));
}

/* delDel */
public String delDel(String str) {
  if (str.length()>=4 && str.substring(1,4).equals("del")) {
    return str.replace("del","");
  }
  return str;
}

/* mixStart */
public boolean mixStart(String str) {
  return str.length()>=3 && str.substring(1,3).equals("ix");
}

/* startOz */
public String startOz(String str) {
  String str_new = "";
  if (str.length()>0 && str.substring(0,1).equals("o")) {
    str_new = str_new + 'o';
    if (str.length()>1 && str.substring(1,2).equals("z")) {
      str_new = str_new + 'z';
    }
    return str_new;
  }
  else {
    if (str.length()>0 && str.substring(1,2).equals("z")) {
      str_new = str_new + 'z';
      return str_new;
    }    
  }
  return "";
}

/* intMax */
public int intMax(int a, int b, int c) {
  int d = Math.max(a,b);
  return Math.max(d,c);
}

/* close10 */
public int close10(int a, int b) {
  if (Math.abs(a-10)<Math.abs(b-10)){
    return a;
  }
  else if (Math.abs(a-10)>Math.abs(b-10)) {
    return b;
  }
  return 0;
}

/* in3050 */
public boolean in3050(int a, int b) {
  return ((30<=a && a<=40)&&(30<=b && b<=40))||((40<=a && a<=50)&&(40<=b && b<=50));
}

/* max1020 */
public int max1020(int a, int b) {
  if ((10<=a && a<=20) && (10<=b && b<=20)) {
    return Math.max(a,b);
  }
  else if ((10<=a && a<=20) && !(10<=b && b<=20)) {
    return a;
  }
  else if (!(10<=a && a<=20) && (10<=b && b<=20)) {
    return b;
  }
  return 0;
}

/* stringE */
public boolean stringE(String str) {
  int count = 0;
  for (int i=0; i<str.length(); i++) {
    if (str.substring(i, i+1).equals("e")) {
      count++;
    }
  }
  return count>=1 && count<=3;
}

/* lastDigit */
public boolean lastDigit(int a, int b) {
  return a%10 == b%10;
}

/* endUp */
public String endUp(String str) {
  if (str.length()<=3) {
    return str.toUpperCase();
  }
  else {
    String agac = str.substring(str.length()-3,str.length());
    String upper = agac.toUpperCase();
    return str.replace(agac,upper);
  }
}

/* everyNth */
public String everyNth(String str, int n) {
  String str2 = str.substring(0,1);
  if (n<=str.length()-1) {
    for (int i=0; i<(str.length()-1)/n; i++) {
      str2 = str2 + str.substring((i+1)*n,(i+1)*n+1);
    }
     return str2;
  }
   return str.substring(0,1);
}
