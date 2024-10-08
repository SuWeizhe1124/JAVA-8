public class IntegerValue {
  public static void main(String[] argv) {
    System.out.println("10進位 1357       = " + 1357);
  
    int i = 0b01100110; // int 型別, 2進位 
    System.out.println("2進位  0b10010110 = " + i);
    
    long l = 0XABCD; // long 型別, 16進位 
    System.out.println("16進位 0XABCD     = " + l);
    
    short s = 07654; // short 型別, 8進位
    System.out.println("8進位  07654      = " + s);
  }
}
