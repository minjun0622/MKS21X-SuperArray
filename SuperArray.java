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
  //PHASE 2 START.

  private void resize() {
    String[] betterData = new String[ (size * 2) + 1];
    for (int i = 0; i < size; i++) {
    betterData[i] = data[i];
  }
  data = betterData;
  }

  // PHASE 2 COMPLETE.
  // PHASE 3.

  public boolean contains(String target) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(target))
      return true;
    }
    return false;
  }

  public int indexOf(String target) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(target))
      return i;
    }
    return -1;
  }

  public int lastIndexOf(String target) {
    for (int i = size -1; i >= 0; i--) {
      if (data[i].equals(target))
      return i;
    }
    return -1;
  }


}
