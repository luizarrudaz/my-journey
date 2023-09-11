import edu.princeton.cs.algs4.*;

public class RandomWord {
  public static void main(String[] args) {
    int index = 0;
    String champion = "";

    while (!StdIn.isEmpty()) {
      String word = StdIn.readString();
      boolean accept = StdRandom.bernoulli(1 / (index + 1.0));
      if (accept) {
        champion = word;
      }
      index++;
    }
    StdOut.println(champion);
  }
}