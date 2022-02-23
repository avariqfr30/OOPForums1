public class No7PE {
    public static void main(String args[]) {
      int a;
      int b;
      int result;

      a = 3;
      b = a++;
      result = 1;
      result += a - b;

      System.out.println(result);
    }
}