public class SuperArray {
  private String[] data;
  private int size;

public SuperArray() {
  data = new String[10];
}

  public void clear() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public boolean add(String element) {
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

  public String toStringDebug() {
    String result = "[";
    for (int i = 0; i < size; i++) {
      if (i == 0 || i == size) {
        result += data[i];
      }
      else {
        result += ", " + data[i];
      }
      }
    result += "]";
    return result;
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
  //-----------------------------------------------------
  //PHASE 1 COMPLETE.
}
