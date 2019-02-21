package pl.gov.coi.szkolenie.calk;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        char[] s1ch = s1.toCharArray();
        char[] s2ch = s2.toCharArray();
        char wynik = '\0';

        for (int i=0; i<=s1.length(); i++){
            for (int j=0; j<=s2.length(); j++){
                if (s1ch.charAt(i).equalseIgnoreCase(s2ch.charAt(j))){
                    wynik = wynik+s1ch.charAt(i);
                }
            }
        }
     return wynik.toSttring();
    }
}
