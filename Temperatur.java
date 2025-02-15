import java.util.List;

public class Temperatur {
    public int[] temperatur;
    public Temperatur(int[] temperatur) {
        this.temperatur = temperatur;
    }
    public int average(int[] temperatur) {
        int sum = 0;
        for(Integer temperature : temperatur){
            sum += temperature;
        }
        return sum/temperatur.length;
    }
    public int max(int[] Temperatures){
        int max = Temperatures[0];
        for(Integer temperature : Temperatures){
            if(temperature > max){
                max = temperature;
            }
        }
        return max;
    }
    public int min(int[] Temperatures) {
        int min = Temperatures[0];
        for (Integer temperature : Temperatures) {
            if (temperature < min) {
                min = temperature;
            }
        }
        return min;
    }

}
