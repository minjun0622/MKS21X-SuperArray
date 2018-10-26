public class SuperArray {
  private String[] data;
  private int size;

public SuperArray() {
  data = new String[10];
}

  public void clear() {
    return size;
  }

  public int size() {
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
    for (int i = 0; i < size; i++) {
      if (i != size - 1)
      result += data[i] + ", ";
      else
      result += data[i];
    }
    return result + "]";
  }

  public String get(int index) {
    if (index < 0 || index >= size()) {
      return null;
    }
    else
    {
      return data[index];
    }
  }

  public String set(int index, String element) {
    String result = "";
    if (index < 0 || index >= size()) {
      return null;
    }
    else {
      result = data[index];
      element = data[index];
    }
    return result;
  }
}
