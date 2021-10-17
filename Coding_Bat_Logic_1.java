/* cigarParty */
public boolean cigarParty(int cigars, boolean isWeekend) {
  if (!isWeekend) return (40<=cigars && cigars<=60);
  else return 40<=cigars;
}

/* dateFashion */
public int dateFashion(int you, int date) {
  if (you<=2 || date<=2) return 0;
  else if ((you>=8 || date>=8)) return 2;
  return 1;
}

/* squirrelPlay */
public boolean squirrelPlay(int temp, boolean isSummer) {
  if(!isSummer) return 60<=temp && temp <=90;
  return 60<=temp && temp <=100;
}

/* caughtSpeeding */
public int caughtSpeeding(int speed, boolean isBirthday) {
  if (!isBirthday){
    if (speed<=60) return 0;
    else if (60<speed && speed<=80) return 1;
    return 2;
  }
  else {
    if (speed<=65) return 0;
    else if (65<speed && speed<=85) return 1;
    return 2;
  }
}

/* sortaSum */
public int sortaSum(int a, int b) {
  if (10<= a+b && a+b<=20) return 20;
  return a+b;
}

/* alarmClock */
public String alarmClock(int day, boolean vacation) {
  if (!vacation) {
    if (day==0 ||day==6) return "10:00";
    return "7:00";
  }
  else {
    if (day==0 ||day==6) return "off";
    return "10:00";    
  }
}

/* love6 */
public boolean love6(int a, int b) {
  return a==6 || b==6 || a+b==6 || Math.abs(a-b)==6;
}

/* in1To10 */
public boolean in1To10(int n, boolean outsideMode) {
  if(!outsideMode) return 1<=n && n<=10;
  return n<=1 || n>=10;
}

/* specialEleven */
public boolean specialEleven(int n) {
  return n%11==0 || n%11==1;
}

/* more20 */
public boolean more20(int n) {
  return n%20==1 || n%20==2;
}

/* old35 */
public boolean old35(int n) {
  return (n%3==0 || n%5==0) && n%15!=0;
}

/* less20 */
public boolean less20(int n) {
  return n%20==19 || n%20==18;
}

/* nearTen */
public boolean nearTen(int num) {
  return 8<=num%10 || num%10<=2;
}

/* teenSum */
public int teenSum(int a, int b) {
  if ((13<=a && a<=19) || (13<=b && b<=19)) return 19;
  return a+b;
}

/* answerCell */
public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  return !isAsleep && (isMom || (!isMom && !isMorning));
}

/* teaParty */
public int teaParty(int tea, int candy) {
  if (tea<5 || candy<5) return 0;
  else if (tea>=candy*2 || candy>=tea*2) return 2;
  return 1;
}

/* fizzString */
public String fizzString(String str) {
  String start = str.substring(0,1);
  String end = str.substring(str.length()-1,str.length());
  if (start.equals("f")) {
    if (end.equals("b")) {
      return "FizzBuzz";
    }
    return "Fizz";
  }
  else if (end.equals("b")) return "Buzz";
  return str;
}

/* fizzString2 */
public String fizzString2(int n) {
  if (n % 15 == 0) return "FizzBuzz!";
  if (n % 5 == 0) return "Buzz!";
  if (n % 3 == 0) return "Fizz!";
  return String.valueOf(n) + "!";
}

/* twoAsOne */
public boolean twoAsOne(int a, int b, int c) {
  return a+b==c || a+c==b || c+b==a;
}

/* inOrder */
public boolean inOrder(int a, int b, int c, boolean bOk) {
  if (!bOk) return a<b && b<c;
  return b<c;
}

/* inOrderEqual */
public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if(!equalOk) return a<b && b<c;
  return a<=b && b<=c;
}

/* lastDigit */
public boolean lastDigit(int a, int b, int c) {
  return a%10==b%10 || a%10==c%10 || b%10==c%10;
}

/* lessBy10 */
public boolean lessBy10(int a, int b, int c) {
  return Math.abs(a-b)>=10 || Math.abs(b-c)>=10 || Math.abs(a-c)>=10;
}

/* withoutDoubles */
public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  if (noDoubles && die1==die2) {
    if (die1!=6) return die1*2+1;
    return 7;
  }
  return die1+die2;
}

/* maxMod5 */
public int maxMod5(int a, int b) {
  if (a==b) return 0;
  if (a%5 == b%5) return Math.min(a,b);
  return Math.max(a,b);
}

/* redTicket */
public int redTicket(int a, int b, int c) {
  if (a==2 && b==2 && c==2) return 10;
  if (a==b && b==c) return 5;
  if (a!=b && a!=c) return 1;
  return 0;
}

/* greenTicket */
public int greenTicket(int a, int b, int c) {
  if (a==b && b==c) return 20;
  if (a!=b && a!=c && b!=c) return 0;
  return 10;
}

/* blueTicket */
public int blueTicket(int a, int b, int c) {
  if (a+b==10 || a+c==10 || b+c==10) return 10;
  else if (a+b==b+c+10 || a+b==a+c+10) return 5;
  return 0;
}

/* shareDigit */
public boolean shareDigit(int a, int b) {
  return a/10==b/10 || a%10==b/10 || a/10==b%10 || a%10==b%10;
}

/* sumLimit */
public int sumLimit(int a, int b) {
  if (String.valueOf(a+b).length()>String.valueOf(a).length()) {return a;}
  return a+b;
}
