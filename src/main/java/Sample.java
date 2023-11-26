import org.sqids.Sqids;
import java.util.List;

public class Sample {

     public static void main(String[] args) {

         Sqids sq = Sqids.builder().build();
         String id = sq.encode(List.of(1L, 2L, 3L));
         List<Long> nums = sq.decode(id);
         System.out.println(id);
         System.out.println(nums);
     }
}
