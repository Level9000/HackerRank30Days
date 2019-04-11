package thirtydaysofcode;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class DictionariesAndMaps{
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      //create a string, int hashmap
      Map<String, Integer> hashMap = new HashMap<String, Integer>();
          for(int i = 0; i < n; i++){
              String name = in.next();
              int phone = in.nextInt();
              // put values into hashmap
              hashMap.put(name, phone);
          }
          while(in.hasNext()){
              String s = in.next();
              // check hashmap for key value.  Print if true, print "Not found if false"
              if (hashMap.containsKey(s)) {
                  System.out.println(s + "=" + hashMap.get(s));
              } else {
                  System.out.println("Not found");
              }
          }

      in.close();
  }
}