public class BinaryFlips {
    public static void main(String[] args){
        String s = "1101";
        System.out.println(flipCounts(s));
    }
    static int flipCounts(String str){
        char[] arr= str.toCharArray();
        int n = arr.length;
        char[] a1 = new char[n];
        char[] a2 = new char[n];
        int count1 = 0;
        int count2 = 0;
        for(int i = 0;i<n;i++){
            if(i == 0){
                if(arr[i] == '0'){
                    a1[i] = '1';
                    count1 += 1;
                }
                else a1[i] = arr[i];
            }
            else{
                if(a1[i-1] == arr[i]){
                    if(a1[i-1] == '0'){
                        a1[i] = '1';
                    }
                    else a1[i] = '0';
                    count1+=1;
                }
                else a1[i] = arr[i];
            }
        }
        for(int j = 0;j<n;j++){
            if(j == 0){
                if(arr[j] == '1'){
                    a2[j] = '0';
                    count2 += 1;
                }
                else a2[j] = arr[j];
            }
            else{
                if(a2[j-1] == arr[j]){
                    if(a2[j-1] == '0'){
                        a2[j] = '1';
                    }
                    else a2[j] = '0';
                    count2+=1;
                }
                else a2[j] = arr[j];
            }
        }
        for(char i : a1) System.out.print(i+ " ");
        System.out.println(count1);
        for(char i : a2) System.out.print(i+ " ");
        System.out.println(count2);
        if(count1<count2){
            return count1;
        }else return count2;
    }
}
