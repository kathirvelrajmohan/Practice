public class BinaryFlip1 {
    public static void main(String[] args){
        String s = "010110";
        System.out.println(flipCounts(s));
    }
    static int flipCounts(String input) {
        int f1 = counter(input,"0101");
        int f2 = counter(input,"1010");
        System.out.println(f1);
        System.out.println(f2);
        return Math.min(f1,f2);
    }
    static int counter(String input, String template){
        int flips = 0;
        for(int i = 0;i<input.length();i++){
            if(input.charAt(i)!=template.charAt(i%template.length())){
                flips++;
            }
        }
        return flips;
    }
}
