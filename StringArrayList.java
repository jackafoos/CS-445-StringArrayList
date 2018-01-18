//Jacob McAfoos
public class StringArrayList implements StringList{
  private int size;
  private int capacity;
  private String[] array;

  public StringArrayList(){
    array = new String[1];
    size = 0;
    capacity = array.length;
  }

  public int add(String s){
    return 0;
  }

  public String get(int i){
    return "";
  }

  public boolean contains(String s){
    return true;
  }

  public int indexOf(String s){
    return 0;
  }

  public int size(){
    return 0;
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
