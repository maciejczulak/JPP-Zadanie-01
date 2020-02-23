public class StringBuliderClass {
    public static void main(String[] args) {
        String s = "a";
        long start = System.nanoTime();
        for (int i = 0; i< 10000; i++) {
            s = s + "a";
                // s = new StringBulider(s).append("a").toString();
        }
        System.out.println("Time1: " + (System.nanoTime() - start));

        String ss = "a";
        long sstart = System.nanoTime();
        StringBulider sB = new StringBulider(ss);
        for (int i = 0; i< 10000; i++) {
            sB.append("a");
        }
    s = sB.toString();
        System.out.println("Time2: " + (System.nanoTime() - sstart));


    }

}
