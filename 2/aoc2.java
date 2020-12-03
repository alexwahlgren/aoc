import java.io.*;
import java.util.*;

public class aoc2 {

  public static void main(String[] args) {
    try {
      System.out.println(numOfValidPasswords2("aoc2_input.txt"));
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static int numOfValidPasswords1(String input) throws FileNotFoundException,
  NoSuchElementException {
    Scanner scan = new Scanner(new File(input));
    int numValid = 0;
    int min, max, count;
    char polChar;
    String line, pass;

    while (scan.hasNextLine()) {
      count = 0;
      line = scan.nextLine();
      min = Integer.parseInt(line.split(" ")[0].split("-")[0]);
      max = Integer.parseInt(line.split(" ")[0].split("-")[1]);
      polChar = line.split(" ")[1].toCharArray()[0];
      pass = line.split(" ")[2];
      for (char c : pass.toCharArray()) {
        if (c == polChar) { count++; }
      }
      if (min <= count && count <= max) {
        numValid++;
      }
    }
    scan.close();

    return numValid;
  }

  public static int numOfValidPasswords2(String input) throws FileNotFoundException,
  NoSuchElementException {
    Scanner scan = new Scanner(new File(input));
    int numValid = 0;
    int pos1, pos2, count;
    char polChar;
    String line, pass;

    while (scan.hasNextLine()) {
      count = 0;
      line = scan.nextLine();
      pos1 = Integer.parseInt(line.split(" ")[0].split("-")[0]);
      pos2 = Integer.parseInt(line.split(" ")[0].split("-")[1]);
      polChar = line.split(" ")[1].toCharArray()[0];
      pass = line.split(" ")[2];
      if (pass.toCharArray()[pos1-1] == polChar) { count++; }
      if (pass.toCharArray()[pos2-1] == polChar) { count++; }
      if (count == 1) {
        System.out.println(line);
        numValid++;
      }
    }
    scan.close();

    return numValid;
  }

}
