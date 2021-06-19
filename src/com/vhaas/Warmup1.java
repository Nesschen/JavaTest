package com.vhaas;

public class Warmup1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public int sumDouble(int a, int b) {
        int c = a + b;

        return (a == b) ? 2*c : c;
    }

    public int diff21(int n) {
        int diff = Math.abs(21 - n);

        return (n > 21) ? 2*diff : diff;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour > 20 || hour < 7);
    }

    public boolean makes10(int a, int b) {
        return a + b == 10 || a == 10 || b == 10;
    }

    public boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }

    public String notString(String str) {
        return (str.startsWith("not")) ? str : "not " + str;
    }

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n+1);
    }

    public String frontBack(String str) {
        int length = str.length();

        if (length < 2) {
            return str;
        }

        String first = str.substring(0, 1);
        String last = str.substring(length-1);

        if (length > 2) {
            return last + str.substring(1, length-1) + first;
        } else {
            return last + first;
        }
    }

    public String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        } else {
            return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        }
    }

    public String backAround(String str) {
        String lastChar = str.substring(str.length()-1);

        return lastChar + str + lastChar;
    }

    public boolean or35(int n) {
        return (n % 3) == 0 || (n % 5) == 0;
    }

    public String front22(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
    }

    public boolean startHi(String str) {
        return str.length() > 1 && str.startsWith("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    public boolean in1020(int a, int b) {
        return (10 <= a && a <= 20) || (10 <= b && b <= 20);
    }
}
