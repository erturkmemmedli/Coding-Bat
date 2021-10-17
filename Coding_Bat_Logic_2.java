/* makeBricks */
public boolean makeBricks(int small, int big, int goal) {
  if (small+big*5>=goal) {
    if (big*5>goal) {
      if (5-(big*5-goal)%5<=small || (big*5-goal)%5==0) {return true;}
      return false;
    }
    return true;
  }
  return false;
}

/* loneSum */
public int loneSum(int a, int b, int c) {
  int sum = 0;
  if (a!=b && a!=c) {sum = sum + a;}
  if (b!=a && b!=c) {sum = sum + b;}
  if (c!=a && c!=b) {sum = sum + c;}
  return sum;
}

/* luckySum */
public int luckySum(int a, int b, int c) {
  int sum = 0;
  if (a!=13) {
    sum += a;
    if (b!=13) {
      sum += b;
      if (c!=13) {
        sum +=c;
      }
    }
  }
  return sum;
}

/* noTeenSum */
public int noTeenSum(int a, int b, int c) {
  return fixTeen(a)+fixTeen(b)+fixTeen(c);
}
public int fixTeen(int n) {
  if (13<=n && n<=19 && n!=15 && n!=16) return 0;
  else return n;
}

/* roundSum */
public int roundSum(int a, int b, int c) {
  return round10(a)+round10(b)+round10(c);
}
public int round10(int num) {
  if (num%10<5) return num - num%10;
  return num - num%10 + 10;
}

/* closeFar */
public boolean closeFar(int a, int b, int c) {
  int i = Math.abs(a-b);
  int j = Math.abs(a-c);
  int k = Math.abs(c-b);
  if (i<=1 || j<=1) {
    if ((i>=2 && k>=2)|| (j>=2 && k>=2)) {return true;}
    return false;
  }
  return false;
}

/* blackjack */
public int blackjack(int a, int b) {
  if (a<=21 && b<=21) return Math.max(a,b);
  else if (a<=21) return a;
  else if (b<=21) return b;
  return 0;
}

/* evenlySpaced */
public boolean evenlySpaced(int a, int b, int c) {
  int max = Math.max(a,Math.max(b,c));
  int min = Math.min(a,Math.min(b,c));
  int check = Math.max(a,b);
  int check2 = Math.min(a,b);
  if (check>=c && check2<=c) check = c;
  if (check2>=c) check = check2;
  return max-check == check-min;
}

/* makeChocolate */
public int makeChocolate(int small, int big, int goal) {
  if (small+big*5>=goal) {
    if (big*5>goal) {
      if (5-(big*5-goal)%5<=small) {return 5-(big*5-goal)%5;}
      if ((big*5-goal)%5==0) {return 0;}
      return -1;
    }
    return goal-big*5;
  }
  return -1;
}
