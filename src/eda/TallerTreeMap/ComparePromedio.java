package eda.TallerTreeMap;

import java.util.Comparator;

public class ComparePromedio implements Comparator<Estudiante>{
     @Override
     public int compare(Estudiante o1, Estudiante o2) {
        double promedio1 = o1.getPromedio();
        double promedio2 = o2.getPromedio();
        if(promedio1 - promedio2 > 0){
            return -1;
        }
        if(promedio1 - promedio2 < 0){
            return 1;
        }
        return 0;
    }
}
