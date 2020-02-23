public class ZadOpLog {
    public static void pOrq(boolean p, boolean q) {
        boolean or = p||q;{System.out.println(or);}}
    public static void pAndq(boolean p, boolean q) {
        boolean and = p&&q;{System.out.println(and);}}
    public static void pNegAndq(boolean p, boolean q) {
        boolean negAnd = !p&&!q;{System.out.println(negAnd);}}
    public static void andTwo(boolean or, boolean and) {
        boolean andT = or&&and;{System.out.println(andT);}}
    public static void orTwo(boolean andTwo, boolean pNegAndq) {
        boolean orT = andTwo||pNegAndq;{System.out.println(andTwo);}}


    public static void main(String[] args) {
    pOrq(true, false);
    pAndq(true, false);
    pNegAndq(true, false);



    }
}
