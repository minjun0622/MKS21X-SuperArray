public class SuperArray {
  private String[] data;
  private int size;

  public class

  public void clear() {
    return size;
  }

  public boolean isEmpty() {
    size = 0;
  }
  public boolean add(String element) {
    if (data.length <= size)
    resize();
    data[size] = element;
    size++;
    return true;
  }

  public String toString() {
    String result = "[";
    for (int i = 0; i < size; x++) {
      if (i != size - 1)
      result += data[i] + ", ";
      else
      result += data[i];
    }
    return result + "]";
  }
  public String toStringDebug() {

  }
  public String get(int) {

  }
}
