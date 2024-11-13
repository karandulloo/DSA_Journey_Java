package LeetCodeSolutions.Arrays.Easy;

public class BinaryGap {
    public static void main(String[] args) {
        int n = 22;
        String bString = Integer.toString(n,2);
        System.out.println(bString);
        boolean started = false;
        for (int i = 0; i < bString.length(); i++) {
            String subString = bString.substring(i,i+1);
            if(subString.equals("1")){
                started = true;
                if(started){
                    
                }
            }

        }
    }


}
