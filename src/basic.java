import java.util.ArrayList;
import java.util.List;

public class basic {
    List<Integer> li = new ArrayList<>();
  public List<Integer > firstMethod(){
    for(int i=0; i<100; i++) {
       if(i%9==0){
               li.add(i);}

    }
    return li;
    }
    public static void main(String[] args){
      basic b = new basic();
      List<Integer> result = b.firstMethod();
      System.out.println(result);

    }
}
