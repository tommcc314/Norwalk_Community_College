/*
 * Program Name:            StringQueue
 * Program Description:     This program contains the methods for 
 *                          TestStringQueue and stores strings into a queue.
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            07/26/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package lab10;
public class StringQueue {
  String[] names;
  private int size = 0;
  public static final int DEFAULT_CAPACITY = 10;
  private static int firstInitCtr;
  public StringQueue() {
    this(DEFAULT_CAPACITY);
  }
  public StringQueue(int size) {
    names = new String[size];
  }
  public void enqueue(String value) {
    names[size++] = value;
  }
  public String dequeue() {
    String v = names[0];
    for (int i = 0; i < size - 1; i++) {
      names[i] = names[i + 1];
    }
    size--;
    return v;
  }
  public boolean empty() {
    return size == 0;
  }
  public int getSize() {
    return size;
  }
  public void checkFirstInit(char yourFirstInit) {
    for (int i = 0; i < names.length; i++) {
      char firstInit = Character.toLowerCase(names[i].charAt(0));
      if (yourFirstInit == firstInit) {
        firstInitCtr++; 
      }
    }
  }
  public int firstInitCtr() {
    return firstInitCtr;
  }
}