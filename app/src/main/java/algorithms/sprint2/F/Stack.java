package algorithms.sprint2.F;

import java.util.ArrayList;
import java.util.List;

class Stack {
  private final List<String> items;

  public Stack() {
    items = new ArrayList<>();
  }

  public void push(String item) {
    items.add(item);
  }

  public String pop() {
    return items.remove(items.size() - 1);
  }

  public String peek() {
    return items.get(items.size() - 1);
  }

  public int size() {
    return items.size();
  }
}