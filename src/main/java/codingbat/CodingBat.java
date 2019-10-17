package codingbat;

public class CodingBat {
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String firstTwo(String str) {
        return 2 < str.length() ? str.substring(0, 2) : str;
    }

    public String firstHalf(String str) {
        return str.substring(0,str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }

    public String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public String nonStart(String firstString, String secondString) {
        return firstString.substring(1)+secondString.substring(1);
    }

    public String left2(String str) {
        return str.substring(2).concat(str.substring(0,2));
    }

    public String right2(String str) {
        int beginIndex = str.length() - 2;
        int lastIndex = str.length();
        return str.substring(beginIndex,lastIndex).concat(str.substring(0,beginIndex));
    }

    public String theEnd(String str, boolean front) {
        if (front) {
            return String.valueOf(str.charAt(0));
        }
        return String.valueOf(str.charAt(str.length()-1));
    }

    public String withoutEnd2(String str) {
        String temp;
         temp = str.substring(str.length()-1);
         temp = str.substring(1);
        return temp;
    }
}
