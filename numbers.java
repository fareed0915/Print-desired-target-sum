import java.io.*; 
import java.util.Vector;
import java.util.*;

public class numbers
{
  public  List<List<Integer>> combine(int[] array, int target)
  {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
      List<Integer> list = new ArrayList<Integer>();
      List<Integer> set  = new ArrayList<Integer>();
      sets(result, list, set, array, target, 0);
      return result;
    }
    private static void sets(List<List<Integer>> storage,
      List<Integer> list,  List<Integer> set, int[] array, int target,
        int tw) 
        { 
          int total = 0;
          for (int x: list) 
            {
              total += x;
            } 
          if (total == target) 
            {
              storage.add(new ArrayList<Integer>(set));
              return;
            }
 
          if (total < target){
            for (int z = tw; z < array.length; z++)
                {                   
                    list.add(array[z]);
                    set.add(z);
                    sets(storage, list, set, array, target, z+1);
                    set.remove(set.size() - 1);
                    list.remove(list.size() - 1);
                }
            }
        }
}