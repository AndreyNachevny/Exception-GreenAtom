import java.util.ArrayList;
import java.util.List;

public class Test {
    private static final int MAX_SIZE = 10;
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(MAX_SIZE);
        for (int i = 0; i < MAX_SIZE + 10; i++){
            if(list.size() == MAX_SIZE){
                try {
                    throw new MoreThenTenElementsException("Try to add more then 10 elements");
                } catch (MoreThenTenElementsException e) {
                    e.printStackTrace();
                }
            }
            list.add(i);
        }
    }
}
