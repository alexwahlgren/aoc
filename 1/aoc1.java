import java.io.*;
import java.util.*;

public class aoc1 {
  public static void main(String[] args) {
    try {
      System.out.println(find2020a("aoc1_input.txt"));
      System.out.println(find2020b("aoc1_input.txt"));
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  private static int find2020a(String path) throws FileNotFoundException, IOException {
    RandomAccessFile raf1 = new RandomAccessFile(new File(path), "r");
    RandomAccessFile raf2 = new RandomAccessFile(new File(path), "r");
    int num1, num2;
    while (raf1.getFilePointer() < raf1.length()) {
      num1 = Integer.parseInt(raf1.readLine());
      while (raf2.getFilePointer() < raf2.length()) {
        num2 = Integer.parseInt(raf2.readLine());
        if (num1 + num2 == 2020) {
          return num1*num2;
        }
      }
      raf2.seek(0);
    }
    return 0;
  }


  private static int find2020b(String path) throws FileNotFoundException, IOException {
    RandomAccessFile raf1 = new RandomAccessFile(new File(path), "r");
    RandomAccessFile raf2 = new RandomAccessFile(new File(path), "r");
    RandomAccessFile raf3 = new RandomAccessFile(new File(path), "r");
    int num1, num2, num3;
    while (raf1.getFilePointer() < raf1.length()) {
      num1 = Integer.parseInt(raf1.readLine());
      while (raf2.getFilePointer() < raf2.length()) {
        num2 = Integer.parseInt(raf2.readLine());
        while (raf3.getFilePointer() < raf3.length()) {
          num3 = Integer.parseInt(raf3.readLine());
          if (num1+num2+num3 == 2020) {
            return num1*num2*num3;
          }
        }
        raf3.seek(0);
      }
      raf2.seek(0);
    }
    return 0;
  }
}
