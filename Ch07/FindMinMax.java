public class FindMinMax {

  public static void main(String[] argv) {
    int[] temp = {18,21,20,22,22,19,17,20,19}; // 放
    int min = temp[0]; // 盢程放砞ヴじ
    int max = temp[0]; // 盢程蔼放砞ヴじ

    for(int i : temp) { // ゑ耕–じ
      if(i < min){
        min = i; // 穝程放
      }
      if(i > max) {
        max = i; // 穝程蔼放
      }
    }

    System.out.println("程放琌" + min + "");
    System.out.println("程蔼放琌" + max + "");
  }
}
