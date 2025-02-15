import java.util.ArrayList;
import java.util.List;


public class MatheAufgabe {
    public double add(double x, double y) {
        return x + y;
    }
    public double sub(double x, double y) {
        return x - y;
    }
    public int mul(int x, int y) {
        int result=0;
        for(int i=0; i<=y; i++) {
            result+=x;
        }
        return result;
    }

    public boolean perfekt(int nr){
        List<Integer> factors=new ArrayList<>();
        for(int i=1; i<nr; i++) {
            if(nr%i==0) {
                factors.add(i);
            }
        }
        int result=0;
        for(int i=0; i<factors.size(); i++) {
            result+=factors.get(i);
        }

        return nr==result;
    }
    public boolean perfekt2(int nr){
        int count=0;
        for(int i=1; i<nr; i++) {
            if(nr%i==0) {
                count++;
            }
        }
        int index=0;
        int[] factors=new int[count];
        for(int i=0; i<nr; i++) {
            if(nr%i==0) {
                factors[index] = i;
                index++;
            }
        }
        int result=0;
        for(int i=0; i<factors.length; i++) {
            result+=factors[i];
        }

        return result==nr;

    }
}
