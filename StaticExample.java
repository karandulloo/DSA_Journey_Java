public class StaticExample {
    private static int count=0;

    public StaticExample(){
        count ++;
    }

    public static int getCount(){
        return count;
    }
}