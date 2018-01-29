import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyStack {

  private int size = 0;
  private int[] elements;

  public MyStack() {
    this.elements = new int[10];
  }

  public int size() {
    return this.size;
  }

  public boolean isEmpty() {
    return this.size() == 0;
  }

  public void push(int i) {
    if (size == this.elements.length-1) {
      int[] newElements = new int[this.elements.length * 2];
      System.arraycopy(this.elements, 0, newElements, 0, size+1);
      this.elements = newElements;
    }
    this.elements[++size] = i;
  }

  public int pop() {
    if (size != 0) {
      int val = this.elements[size--];
      return val;
    } else {
      throw new NoSuchElementException("No element in stack");
    }
  }

  public int peek() {
    if (size() == 0)
      throw new NoSuchElementException("No element to peek");
    return this.elements[size];
  }
}
