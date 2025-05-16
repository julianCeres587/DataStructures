package eda.TallerTreeMap;
import java.util.Comparator;

public class CompareCodigo  implements Comparator<String> {
    @Override
     public int compare(String o1, String o2) {
        String codigo1 = o1;
        String codigo2 = o2;
        return codigo1.compareTo(codigo2);
    }
}
