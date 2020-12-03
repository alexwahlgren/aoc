import java.io.*;
import java.util.*;

public class aoc3 {

  public static void main(String[] args) {
    try {
      System.out.println(slope2("aoc3_input.txt"));
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static int slope2(String input) throws FileNotFoundException {
    int trees1, trees2, trees3, trees4, trees5, xpos, lineCount;
    trees1 = trees2 = trees3 = trees4 = trees5 = xpos = lineCount = 0;
    char[] line;
    Scanner scan = new Scanner(new File(input));
    while (scan.hasNextLine()) {
      line = scan.nextLine().toCharArray();
      //slope1 (right 1, down 1)
      if (line[(lineCount*1) % line.length] == '#') { trees1++; }
      //slope2 (right 3, down 1)
      if (line[(lineCount*3) % line.length] == '#') { trees2++; }
      //slope3 (right 5, down 1)
      if (line[(lineCount*5) % line.length] == '#') { trees3++; }
      //slope4 (right 7, down 1)
      if (line[(lineCount*7) % line.length] == '#') { trees4++; }
      //slope5 (right 1, down 2)
      if (line[(Math.floorDiv(lineCount, 2)*1) % line.length] == '#' &&
          lineCount % 2 == 0) { trees5++; }

      lineCount++;
    }
    int res = (trees1*trees2*trees3*trees4*trees5);
    return res;
  }

}
