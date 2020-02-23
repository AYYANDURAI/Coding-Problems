static int bits(String s){
        int bit=0;
        for(int i=0;i<s.length();i++)
            bit |= 1<<(s.charAt(i)-'a');
        return bit;
    }
    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        int a = bits(s1);
        int b = bits(s2);
        return (a & b)>=1 ? "YES" : "NO";
    }
