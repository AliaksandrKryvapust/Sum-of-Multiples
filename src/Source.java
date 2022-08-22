public class Source {
    public static void main(String[] args) {
        int n = 4;
        int m =123;
        try {
            System.out.println(sumMul(n, m) == 1860);
        }
        catch (Exception e){
            System.out.println("Wrong argument");
        }
    }
    public static long sumMul(int n, int m) throws Exception {
        int result = 0;
        Exception IllegalArgumentException = new Exception();
        if (m > n) {
            for (int i = n; i < m; i += n) {
                result += i;
            }
            return result;
        } else throw IllegalArgumentException;
    }
}
