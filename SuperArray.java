public class SuperArray {
  private String[] data;
  private int size;

public SuperArray() {
  data = new String[10];
}

public SuperArray(int startingCapacity) {
  if (size < 0) {
    throw new IllegalArgumentException(int startingCapacity + "unable to be negative.");
  }
else
data = new String[startingCapacity]
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

  public boolean add(int index, String element) {
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
      return IndexOutOfBoundsException(index + "out of bounds.");
    }
    else
    {
      return data[index];
    }
  }

  public String set(int index, String element) {
    String result = "";
    if (index < 0 || index >= size()) {
      return IndexOutOfBoundsException(index + "out of bounds.");
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
  public void add(int index, String element) {
    if (index < 0 || index > size())
    throw new IndexOutOfBoundsException(index + "out of bounds.");
    else {
      if (data.length <= size)
      resize();
      String[] betterData = new String[data.length];
      for (int i = 0; i < index; i++) {
        betterData[i] = data[i];
      }
      betterData[index] = element;
      size++;
      for (int i = index; i < size + 1; i++) {
        betterData[i + 1] = data[i];
      }
      betterData = data;
    }
  }

  public String remove(int index) {
    String result = data[index];
    if (index < 0 || index > size())
    throw new IndexOutOfBoundsException(index + "out of bounds.");
      String[] betterData = new String[data.length];
      for (int i = 0; i < index; i++) {
        betterData[i] = data[i];
      }
      size--;
      for (int i = index; i < size; i++) {
        betterData[i] = data[i+1];
      }
      betterData = data;
    }
    return result;
  }

  public boolean remove(int index) {
    if (contains(element)) {
      remove(indexOf(element));
      return true;
    }
    return (contains(element));
  }

}
