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
      String[] tempArry = new String[capacity  * 2];
      System.arraycopy(array, 0, tempArry, 0, size);
      array = tempArry;
      capacity = array.length;
    }
  }
  //returns value at the given index
  public String get(int i){
    return array[i];
  }
  /*returns true if array contains the given string s
   *returns false otherwise
   */
  public boolean contains(String s){
    return indexOf(s) != -1;
  }
  /*returns the index of the requested string,
   *returns -1 if the array is not an element of arraycopy
   */
  public int indexOf(String s){
    int index = 0;
    for (String temp : array){
      if (temp.equals(s))
        return index;
      else
        index ++;
    }
    return -1;
  }
//returns the number of elements in array
  public int size(){
    return size;
  }

  public int add(int index, String s){
    ensureCapacity();
    for (int a = size; a > index; a--){
      array[a] = array[a - 1];
    }
    array[index] = s;
    size++;
    return index;
  }
  /*sets array to an empty array
   *sets capacity to the length of new array
   *sets size back to 0
   */
  public void clear(){
    array = new String[1];
    size  = 0;
    capacity = array.length;
  }
  /*returns false if the loop finds at least one entry that is not null.
   *otherwise returns assertTrue
   */
  public boolean isEmpty(){
    if (size == 0)
      return true;
    else
      return false;
  }
  /*removes string at the specified index from the array
   *shifts all objects to compensate
   */
  public String remove(int i){
    String s = array[i];
    for (int a = i; a < size - 1; a++){
      array[a] = array[a + 1];
    }
    size--;
    array[size] = null;
    return s;
  }
  //Throw index out of Bounds exception if size < length, and size < index!!!!!!
  //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
  //with try catch
  public void set(int index, String s){
    if (size < capacity && size < index){
      throw new IndexOutOfBoundsException();
    }
    else{
      array[index] = s;
    }
  }
  //creates a copy of array that is the right size
  public String[] toArray(){
    String[] tempArray = new String[size];
    System.arraycopy(array, 0, tempArray, 0, size);
    return tempArray;
  }
}
