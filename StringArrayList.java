//Jacob McAfoos
public class StringArrayList implements StringList{
  private int size;
  private int capacity;
  private String[] array;

  public StringArrayList(){
    array = new String[1];//main array implementation
    size = 0;//number of elements in the array
    capacity = array.length;//numer of items that can be held in the array
  }

  /*Adds a string s to the array,
   *resizes array by 2 times if needed using ensureCapacity();
   */
  public int add(String s){
    ensureCapacity();//Assume this makes space for new elements if needed
    array[size] = s;
    size++;
    return size - 1;
  }

  /*checks to make sure the capacity is greater than the size,
   *if not, doubles the size of the array
   */
  private void ensureCapacity(){
    if (size == capacity){
      String[] tempArry = new String[capacity * 2];
      System.arraycopy(array, 0, tempArry, 0, size);
      array = tempArry;
      capacity = array.length;
    }
  }
  //returns value at the given index
  //NEEDS TO BE COMPLETED FOR INDEX OUT OF BOUNDS!!!!!!!!!!!!!!!
  public String get(int i){
    return array[i];
  }
  /*returns true if array contains the given string s
   *returns false otherwise
   */
  public boolean contains(String s){
    for (String temp : array){
      if (temp.equals(s));
        return true;
    }
    return false;
  }

  public int indexOf(String s){
    long index = 0;
    for (String temp : array){
      if (temp.equals(s))
        return index;
      else
        index ++
    }
    return -1;
  }

  public int size(){
    return size;
  }

  public int add(int index, String s){
    return 0;
  }

  public void clear(){}

  public boolean isEmpty(){
    return true;
  }

  public String remove(int i){
    return "";
  }
  public void set(int index, String s){}

  public String[] toArray(){
    return new String[1];
  }
}
