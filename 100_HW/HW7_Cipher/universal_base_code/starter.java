import pkg.*;
import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        String x = "6v lvp u5vuy5 y1z5 qpsqy5r";
        String de = Cipher.encode(x);
        System.out.println(de);
        String z = "sv8vq17r 1r q25 85rq";
        String di = Cipher.encode(z);
        System.out.println(di);
        String b = "q25 z5l qv wpx85s f 1r gg";
        String d = Cipher.encode(b);
        System.out.println(d);
        String a = "z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz";
        String c = Cipher.keyedEncode(a, 33);
        System.out.println(c);
        String q = "29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d";
        String w = Cipher.encode(q);
        System.out.println(w);
        String e = "a8 1oy 92 1kx rxdj in 4";
        String r = Cipher.keyedEncode(e, 8);
        System.out.println(r);
        String g = "549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8";
        String h = Cipher.keyedEncode(g, 16);
        System.out.println(h);
        String j = "lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw";
        String k = Cipher.encode(j);
        System.out.println(k);
        String l = "u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y";
        String n = Cipher.keyedEncode(l, 36);
        System.out.println(n);
        
        
        
    }
}
